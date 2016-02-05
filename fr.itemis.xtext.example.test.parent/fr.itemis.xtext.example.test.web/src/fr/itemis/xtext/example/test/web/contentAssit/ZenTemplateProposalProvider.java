package fr.itemis.xtext.example.test.web.contentAssit;

import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.util.TextRegion;

public class ZenTemplateProposalProvider {
	
	protected static final int TEMPLATE_PRIORITY = 100;
	
	public void createStatementTemplateProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		if ("if".startsWith(context.getPrefix())) {
			acceptor.accept(createIfBlockTemplate(context), TEMPLATE_PRIORITY);
			acceptor.accept(createIfElseBlockTemplate(context), TEMPLATE_PRIORITY);
		}
		if ("forEach".startsWith(context.getPrefix())) {
			acceptor.accept(createForEachLoopArrayTemplate(context), TEMPLATE_PRIORITY);
		}
	}
	
	public void createSelectorTemplateProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		if (".forEach".startsWith(context.getPrefix())) {
			acceptor.accept(createForEachLoopTemplate(context), TEMPLATE_PRIORITY);
			acceptor.accept(createForEachLoopFunctionTemplate(context), TEMPLATE_PRIORITY);
		}
	}
	
	public void createLiteralTemplateProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		acceptor.accept(createKeyValueTemplate(context), TEMPLATE_PRIORITY);
		acceptor.accept(createArrayLiteralTemplate(context), TEMPLATE_PRIORITY);
	}
	
	protected ContentAssistEntry createIfBlockTemplate(ContentAssistContext context) {
		ContentAssistEntry entry = new ContentAssistEntry();
		entry.setLabel("if");
		entry.setDescription("if-block");
		String template =
				"if (${condition}) {\n"
				+ "\t${}\n"
				+ "}";
		createProposal(template, entry, context);
		return entry;
	}
	
	protected ContentAssistEntry createIfElseBlockTemplate(ContentAssistContext context) {
		ContentAssistEntry entry = new ContentAssistEntry();
		entry.setLabel("if");
		entry.setDescription("if-else-block with compare");
		String template =
				"if ((${expression1} == ${value1}) || (${expression2} == ${value2})) {\n"
				+ "\t${if_statements}\n"
				+ "} else {\n"
				+ "\t${else_statements}\n" 
				+ "}";
		createProposal(template, entry, context);
		return entry;
	}
	
	protected ContentAssistEntry createForEachLoopArrayTemplate(ContentAssistContext context) {
		ContentAssistEntry entry = new ContentAssistEntry();
		entry.setLabel("forEach");
		entry.setDescription("forEach-loop over array");
		String template =
				"${array}.forEach(function(${element}, ${index}) {\n"
				+ "\t${}\n"
				+ "});";
		createProposal(template, entry, context);
		return entry;
	}
	
	protected ContentAssistEntry createForEachLoopTemplate(ContentAssistContext context) {
		ContentAssistEntry entry = new ContentAssistEntry();
		entry.setLabel(".forEach");
		entry.setDescription("forEach-loop over array");
		String template =
				".forEach(function(${element}, ${index}) {\n"
				+ "\t${}\n"
				+ "});";
		createProposal(template, entry, context);
		return entry;
	}
	
	protected ContentAssistEntry createForEachLoopFunctionTemplate(ContentAssistContext context) {
		ContentAssistEntry entry = new ContentAssistEntry();
		entry.setLabel(".forEach(function(value, key) {");
		entry.setDescription("forEach-loop over JSON");
		String template =
				".forEach(function(${value}, ${key}) {\n"
				+ "\t${}\n"
				+ "});";
		createProposal(template, entry, context);
		return entry;
	}
	
	protected ContentAssistEntry createKeyValueTemplate(ContentAssistContext context) {
		ContentAssistEntry entry = new ContentAssistEntry();
		entry.setLabel("{key: value}");
		entry.setDescription("key-value pairs (JSON)");
		String template =
				"{\n"
				+ "\t${key1}: ${value1},\n" 
				+ "\t${key2}: ${value2}\n"
				+ "}";
		createProposal(template, entry, context);
		return entry;
	}
	
	protected ContentAssistEntry createArrayLiteralTemplate(ContentAssistContext context) {
		ContentAssistEntry entry = new ContentAssistEntry();
		entry.setLabel("[entry1, entry2]");
		entry.setDescription("list (array)");
		String template =
				"[${entry1}, ${entry2}]";
		createProposal(template, entry, context);
		return entry;
	}
	
	protected void createProposal(String template, ContentAssistEntry entry,
			ContentAssistContext context) {
		// TODO fix indentation for multi-line templates
		StringBuilder proposal = new StringBuilder();
		for (int i = 0; i < template.length(); i++) {
			char c = template.charAt(i);
			if (c == '$' && i + 1 < template.length()) {
				char startChar = template.charAt(i + 1);
				if (startChar == '$') {
					proposal.append('$');
					i++;
				} else if (startChar == '{') {
					int varStart = i + 2;
					for (i = varStart; i < template.length() && template.charAt(i) != '}'; i++) {
					}
					String variable = template.substring(varStart, i);
					int offset = context.getReplaceRegion().getOffset() + proposal.length();
					if (variable.length() == 0) {
						entry.setEscapePosition(offset);
					} else {
						entry.getEditPositions().add(new TextRegion(offset, variable.length()));
						proposal.append(variable);
					}
				}
			} else {
				proposal.append(c);
			}
		}
		entry.setProposal(proposal.toString());
		entry.setPrefix(context.getPrefix());
	}

}
