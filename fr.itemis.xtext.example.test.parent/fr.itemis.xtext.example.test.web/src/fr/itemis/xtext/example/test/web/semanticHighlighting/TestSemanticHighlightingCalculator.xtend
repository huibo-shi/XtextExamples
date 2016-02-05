package fr.itemis.xtext.example.test.web.semanticHighlighting

import com.google.inject.Inject
import fr.itemis.xtext.example.test.test.Variable
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.util.CancelIndicator
import fr.itemis.xtext.example.test.test.TestPackage

import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

class TestSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator{
	@Inject extension OperationCanceledManager
	
	override protected highlightElement(EObject it, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		switch it {
			Variable: {
				highlightVariable(it, TestPackage.Literals.VARIABLE__NAME, acceptor, cancelIndicator)
				return true
				}
		}
		return false
	}
	
	protected def highlightVariable(EObject owner, Variable variable, EStructuralFeature feature,
			IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		cancelIndicator.checkCanceled
		owner.findNodesForFeature(feature).forEach[
			acceptor.addPosition(offset, length, "Variables")
		]
	}
}