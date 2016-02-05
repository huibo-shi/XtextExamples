package fr.itemis.xtext.example.test.web.contentAssit

import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.eclipse.xtext.util.TextRegion

class TestTemplateProposalProvider {
	protected static final int TEMPLATE_PRIORITY = 100

	def void createTemplateProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
			acceptor.accept(createAWTemplate(context), TEMPLATE_PRIORITY)
			acceptor.accept(createFORTemplate(context), TEMPLATE_PRIORITY)
			acceptor.accept(createFOREACHTemplate(context), TEMPLATE_PRIORITY)
	}

	def protected ContentAssistEntry createAWTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("if")
		entry.setDescription("if-else-block with compare")
		var String template = '''if ((${expression1} == ${value1}) || (${expression2} == ${value2})) {
			${if_statements}
		} else {
			${else_statements}
		}'''
		createProposal(template, entry, context)
		return entry
	}
	
	def protected ContentAssistEntry createFORTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("for")
		entry.setDescription("if-else-block with compare")
		var String template = '''for ((${expression1} == ${value1}) || (${expression2} == ${value2})) {
			${if_statements}
		} else {
			${else_statements}
		}'''
		createProposal(template, entry, context)
		return entry
	}
	
	def protected ContentAssistEntry createFOREACHTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("forEach")
		entry.setDescription("if-else-block with compare")
		var String template = '''forEach ((${expression1} == ${value1}) || (${expression2} == ${value2})) {
			${if_statements}
		} else {
			${else_statements}
		}'''
		createProposal(template, entry, context)
		return entry
	}

	def protected void createProposal(String template, ContentAssistEntry entry, ContentAssistContext context) {
		// TODO fix indentation for multi-line templates
		var StringBuilder proposal = new StringBuilder()
		for (var int i = 0; i < template.length(); i++) {
			var char c = (template.charAt(i)) as char
			if (c === Character.valueOf('$').charValue && i + 1 < template.length()) {
				var char startChar = (template.charAt(i + 1)) as char
				if (startChar === Character.valueOf('$').charValue) {
					proposal.append(Character.valueOf('$').charValue)
					i++
				} else if (startChar === Character.valueOf('{').charValue) {
					var int varStart = i + 2
					for (i = varStart; i < template.length() &&
						template.charAt(i) !== Character.valueOf('}').charValue; i++) {
					}
					var String variable = template.substring(varStart, i)
					var int offset = context.getReplaceRegion().getOffset() + proposal.length()
					if (variable.length() === 0) {
						entry.setEscapePosition(offset)
					} else {
						entry.getEditPositions().add(new TextRegion(offset, variable.length()))
						proposal.append(variable)
					}
				}
			} else {
				proposal.append(c)
			}
		}
		entry.setProposal(proposal.toString())
		entry.setPrefix(context.getPrefix())
	}
}
