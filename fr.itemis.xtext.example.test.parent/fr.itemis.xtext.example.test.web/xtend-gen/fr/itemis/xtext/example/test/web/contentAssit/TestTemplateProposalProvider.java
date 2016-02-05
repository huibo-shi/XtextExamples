package fr.itemis.xtext.example.test.web.contentAssit;

import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;

@SuppressWarnings("all")
public class TestTemplateProposalProvider {
  protected final static int TEMPLATE_PRIORITY = 100;
  
  public void createTemplateProposals(final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    ContentAssistEntry _createAWTemplate = this.createAWTemplate(context);
    acceptor.accept(_createAWTemplate, TestTemplateProposalProvider.TEMPLATE_PRIORITY);
    ContentAssistEntry _createFORTemplate = this.createFORTemplate(context);
    acceptor.accept(_createFORTemplate, TestTemplateProposalProvider.TEMPLATE_PRIORITY);
    ContentAssistEntry _createFOREACHTemplate = this.createFOREACHTemplate(context);
    acceptor.accept(_createFOREACHTemplate, TestTemplateProposalProvider.TEMPLATE_PRIORITY);
  }
  
  protected ContentAssistEntry createAWTemplate(final ContentAssistContext context) {
    ContentAssistEntry entry = new ContentAssistEntry();
    entry.setLabel("if");
    entry.setDescription("if-else-block with compare");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ((${expression1} == ${value1}) || (${expression2} == ${value2})) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("${if_statements}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("${else_statements}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    String template = _builder.toString();
    this.createProposal(template, entry, context);
    return entry;
  }
  
  protected ContentAssistEntry createFORTemplate(final ContentAssistContext context) {
    ContentAssistEntry entry = new ContentAssistEntry();
    entry.setLabel("for");
    entry.setDescription("if-else-block with compare");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for ((${expression1} == ${value1}) || (${expression2} == ${value2})) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("${if_statements}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("${else_statements}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    String template = _builder.toString();
    this.createProposal(template, entry, context);
    return entry;
  }
  
  protected ContentAssistEntry createFOREACHTemplate(final ContentAssistContext context) {
    ContentAssistEntry entry = new ContentAssistEntry();
    entry.setLabel("forEach");
    entry.setDescription("if-else-block with compare");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("forEach ((${expression1} == ${value1}) || (${expression2} == ${value2})) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("${if_statements}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("${else_statements}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    String template = _builder.toString();
    this.createProposal(template, entry, context);
    return entry;
  }
  
  protected void createProposal(final String template, final ContentAssistEntry entry, final ContentAssistContext context) {
    StringBuilder proposal = new StringBuilder();
    for (int i = 0; (i < template.length()); i++) {
      {
        char _charAt = template.charAt(i);
        char c = ((char) _charAt);
        boolean _and = false;
        Character _valueOf = Character.valueOf('$');
        char _charValue = _valueOf.charValue();
        boolean _tripleEquals = (c == _charValue);
        if (!_tripleEquals) {
          _and = false;
        } else {
          int _length = template.length();
          boolean _lessThan = ((i + 1) < _length);
          _and = _lessThan;
        }
        if (_and) {
          char _charAt_1 = template.charAt((i + 1));
          char startChar = ((char) _charAt_1);
          Character _valueOf_1 = Character.valueOf('$');
          char _charValue_1 = _valueOf_1.charValue();
          boolean _tripleEquals_1 = (startChar == _charValue_1);
          if (_tripleEquals_1) {
            Character _valueOf_2 = Character.valueOf('$');
            char _charValue_2 = _valueOf_2.charValue();
            proposal.append(_charValue_2);
            i++;
          } else {
            Character _valueOf_3 = Character.valueOf('{');
            char _charValue_3 = _valueOf_3.charValue();
            boolean _tripleEquals_2 = (startChar == _charValue_3);
            if (_tripleEquals_2) {
              int varStart = (i + 2);
              for (i = varStart; ((i < template.length()) && 
                (template.charAt(i) != Character.valueOf('}').charValue())); i++) {
              }
              String variable = template.substring(varStart, i);
              ITextRegion _replaceRegion = context.getReplaceRegion();
              int _offset = _replaceRegion.getOffset();
              int _length_1 = proposal.length();
              int offset = (_offset + _length_1);
              int _length_2 = variable.length();
              boolean _tripleEquals_3 = (_length_2 == 0);
              if (_tripleEquals_3) {
                entry.setEscapePosition(Integer.valueOf(offset));
              } else {
                ArrayList<TextRegion> _editPositions = entry.getEditPositions();
                int _length_3 = variable.length();
                TextRegion _textRegion = new TextRegion(offset, _length_3);
                _editPositions.add(_textRegion);
                proposal.append(variable);
              }
            }
          }
        } else {
          proposal.append(c);
        }
      }
    }
    String _string = proposal.toString();
    entry.setProposal(_string);
    String _prefix = context.getPrefix();
    entry.setPrefix(_prefix);
  }
}
