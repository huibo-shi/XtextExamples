package fr.itemis.xtext.example.test.web.semanticHighlighting;

@SuppressWarnings("all")
public class TestSemanticHighlightingCalculator /* implements DefaultSemanticHighlightingCalculator  */{
  /* @Inject
   */private /* OperationCanceledManager */Object _operationCanceledManager;
  
  @Override
  protected boolean highlightElement(final /* EObject */Object it, final /* IHighlightedPositionAcceptor */Object acceptor, final /* CancelIndicator */Object cancelIndicator) {
    throw new Error("Unresolved compilation problems:"
      + "\nVariable cannot be resolved to a type."
      + "\nThe method or field TestPackage is undefined"
      + "\nLiterals cannot be resolved"
      + "\nVARIABLE__NAME cannot be resolved");
  }
  
  protected Object highlightVariable(final /* EObject */Object owner, final /* Variable */Object variable, final /* EStructuralFeature */Object feature, final /* IHighlightedPositionAcceptor */Object acceptor, final /* CancelIndicator */Object cancelIndicator) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field offset is undefined"
      + "\nThe method or field length is undefined"
      + "\ncheckCanceled cannot be resolved"
      + "\nfindNodesForFeature cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\naddPosition cannot be resolved");
  }
}
