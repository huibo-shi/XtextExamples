package fr.itemis.xtext.example.test.web.semanticHighlighting;

import com.google.inject.Inject;
import fr.itemis.xtext.example.test.test.TestPackage;
import fr.itemis.xtext.example.test.test.Variable;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TestSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  @Inject
  @Extension
  private OperationCanceledManager _operationCanceledManager;
  
  @Override
  protected boolean highlightElement(final EObject it, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _matched = false;
    if (!_matched) {
      if (it instanceof Variable) {
        _matched=true;
        this.highlightVariable(it, ((Variable)it), TestPackage.Literals.VARIABLE__NAME, acceptor, cancelIndicator);
        return true;
      }
    }
    return false;
  }
  
  protected void highlightVariable(final EObject owner, final Variable variable, final EStructuralFeature feature, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    this._operationCanceledManager.checkCanceled(cancelIndicator);
    List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(owner, feature);
    final Consumer<INode> _function = new Consumer<INode>() {
      @Override
      public void accept(final INode it) {
        int _offset = it.getOffset();
        int _length = it.getLength();
        acceptor.addPosition(_offset, _length, "Variables");
      }
    };
    _findNodesForFeature.forEach(_function);
  }
}
