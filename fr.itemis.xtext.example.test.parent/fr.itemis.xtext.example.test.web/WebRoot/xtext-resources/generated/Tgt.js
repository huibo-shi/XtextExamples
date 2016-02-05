define(function(require, exports, module) {
"use strict";

var oop = require("ace/lib/oop");
var Range = require("ace/range").Range;
var CFoldMode = require("./cstyle").FoldMode;

var FoldMode = exports.FoldMode = function(commentRegex) {
    if (commentRegex) {
        this.foldingStartMarker = new RegExp(
            this.foldingStartMarker.source.replace(/\|[^|]*?$/, "|" + commentRegex.start)
        );
        this.foldingStopMarker = new RegExp(
            this.foldingStopMarker.source.replace(/\|[^|]*?$/, "|" + commentRegex.end)
        );
    }
};
oop.inherits(FoldMode, CFoldMode);

(function() {
    this.usingRe = /^\s*using \S/;
    this.tgtBlock = /^\s*(预置脚本 preShell|操作步骤 stepShell|后置脚本 afterShell|声明变量 declareVariable)/;

    this.getFoldWidgetRangeBase = this.getFoldWidgetRange;
    this.getFoldWidgetBase = this.getFoldWidget;
    
    this.getFoldWidget = function(session, foldStyle, row) {
        var fw = this.getFoldWidgetBase(session, foldStyle, row);
        if (!fw) {
            var line = session.getLine(row);
            if (/^\s*#region\b/.test(line)) 
                return "start";
            var block = this.tgtBlock;
            if (block.test(line)) {
                var next = session.getLine(row + 1);
                if (!block.test(next)){
                    return "start";
                }
            }
        }
        return fw;
    };
    
    this.getFoldWidgetRange = function(session, foldStyle, row) {
        var range = this.getFoldWidgetRangeBase(session, foldStyle, row);
        if (range)
            return range;

        var line = session.getLine(row);
        if (this.tgtBlock.test(line))
            return this.getTgtBlockStatementBlock(session, line, row);
            
        if (/^\s*#region\b/.test(line))
            return this.getRegionBlock(session, line, row);
    };
    
    this.getTgtBlockStatementBlock = function(session, line, row) {
        var startColumn = line.match(this.tgtBlock)[0].length - 1;
        var maxRow = session.getLength();
        var startRow = row;
        var endRow = row;

        while (++row < maxRow) {
            line = session.getLine(row);
            if (/^\s*$/.test(line))
                continue;
            if (this.tgtBlock.test(line))
                break;

            endRow = row;
        }
		
        if (endRow > startRow) {
            var endColumn = session.getLine(endRow).length;
            return new Range(startRow, startColumn, endRow, endColumn);
        }
    };
    
    this.getRegionBlock = function(session, line, row) {
        var startColumn = line.search(/\s*$/);
        var maxRow = session.getLength();
        var startRow = row;
        
        var re = /^\s*#(end)?region\b/;
        var depth = 1;
        while (++row < maxRow) {
            line = session.getLine(row);
            var m = re.exec(line);
            if (!m)
                continue;
            if (m[1])
                depth--;
            else
                depth++;

            if (!depth)
                break;
        }

        var endRow = row;
        if (endRow > startRow) {
            return new Range(startRow, startColumn, endRow, line.length);
        }
    };

}).call(FoldMode.prototype);

});