package fr.itemis.xtext.example.kwdl.generator;

import com.google.common.base.Objects;
import fr.itemis.xtext.example.kwdl.KwdlStandaloneSetup;
import fr.itemis.xtext.example.kwdl.kwdl.Keyword;
import fr.itemis.xtext.example.kwdl.kwdl.KwdlFactory;
import fr.itemis.xtext.example.kwdl.kwdl.Parameter;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe2.runtime.Mandatory;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class LibraryGenerator extends AbstractWorkflowComponent2 {
  protected IFileSystemAccess fsa;
  
  @Accessors
  private String outpath;
  
  public LibraryGenerator() {
    KwdlStandaloneSetup _kwdlStandaloneSetup = new KwdlStandaloneSetup();
    _kwdlStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
  
  @Mandatory
  public String setOutputFolder(final String path) {
    return this.outpath = path;
  }
  
  public ArrayList<Keyword> getPaseredXml() {
    ArrayList<Keyword> _xblockexpression = null;
    {
      final ArrayList<Keyword> result = CollectionLiterals.<Keyword>newArrayList();
      Keyword _createKeyword = KwdlFactory.eINSTANCE.createKeyword();
      final Procedure1<Keyword> _function = new Procedure1<Keyword>() {
        public void apply(final Keyword it) {
          it.setName("OpenBrowser");
          EList<Parameter> _parameters = it.getParameters();
          Parameter _createParameter = KwdlFactory.eINSTANCE.createParameter();
          final Procedure1<Parameter> _function = new Procedure1<Parameter>() {
            public void apply(final Parameter it) {
              it.setName("type");
              it.setOptional(false);
              it.setDefaultValue("iexplorer");
              EList<String> _valuePool = it.getValuePool();
              _valuePool.add("iexplorer");
              EList<String> _valuePool_1 = it.getValuePool();
              _valuePool_1.add("firefox");
              EList<String> _valuePool_2 = it.getValuePool();
              _valuePool_2.add("chrome");
            }
          };
          Parameter _doubleArrow = ObjectExtensions.<Parameter>operator_doubleArrow(_createParameter, _function);
          _parameters.add(_doubleArrow);
          EList<Parameter> _parameters_1 = it.getParameters();
          Parameter _createParameter_1 = KwdlFactory.eINSTANCE.createParameter();
          final Procedure1<Parameter> _function_1 = new Procedure1<Parameter>() {
            public void apply(final Parameter it) {
              it.setName("url");
              it.setOptional(true);
            }
          };
          Parameter _doubleArrow_1 = ObjectExtensions.<Parameter>operator_doubleArrow(_createParameter_1, _function_1);
          _parameters_1.add(_doubleArrow_1);
        }
      };
      Keyword _doubleArrow = ObjectExtensions.<Keyword>operator_doubleArrow(_createKeyword, _function);
      result.add(_doubleArrow);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public CharSequence compile(final ArrayList<Keyword> keywords) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Keyword keyword : keywords) {
        _builder.append("keyword ");
        String _name = keyword.getName();
        _builder.append(_name, "");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        {
          EList<Parameter> _parameters = keyword.getParameters();
          for(final Parameter parameter : _parameters) {
            {
              boolean _isOptional = parameter.isOptional();
              if (_isOptional) {
                _builder.append("\t");
                _builder.append("optional parameter ");
                String _name_1 = parameter.getName();
                _builder.append(_name_1, "\t");
                _builder.append(" ");
                CharSequence _compileParameterBody = this.compileParameterBody(parameter);
                _builder.append(_compileParameterBody, "\t");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("parameter ");
                String _name_2 = parameter.getName();
                _builder.append(_name_2, "\t");
                _builder.append(" ");
                CharSequence _compileParameterBody_1 = this.compileParameterBody(parameter);
                _builder.append(_compileParameterBody_1, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence compileParameterBody(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _defaultValue = parameter.getDefaultValue();
      boolean _notEquals = (!Objects.equal(_defaultValue, null));
      if (_notEquals) {
        _builder.append("{");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("DefaultValue : ");
        String _defaultValue_1 = parameter.getDefaultValue();
        _builder.append(_defaultValue_1, "\t");
        _builder.newLineIfNotEmpty();
        {
          EList<String> _valuePool = parameter.getValuePool();
          boolean _isEmpty = _valuePool.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append("\t");
            _builder.append("ValuePool : [");
            EList<String> _valuePool_1 = parameter.getValuePool();
            String _join = IterableExtensions.join(_valuePool_1, ",");
            _builder.append(_join, "\t");
            _builder.append("]");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      } else {
        EList<String> _valuePool_2 = parameter.getValuePool();
        boolean _isEmpty_1 = _valuePool_2.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          _builder.append("{");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("ValuePool : [");
          EList<String> _valuePool_3 = parameter.getValuePool();
          String _join_1 = IterableExtensions.join(_valuePool_3, ",");
          _builder.append(_join_1, "\t");
          _builder.append("]");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
        }
      }
    }
    return _builder;
  }
  
  protected void invokeInternal(final WorkflowContext arg0, final ProgressMonitor arg1, final Issues arg2) {
    JavaIoFileSystemAccess _javaIoFileSystemAccess = new JavaIoFileSystemAccess();
    this.fsa = _javaIoFileSystemAccess;
    ArrayList<Keyword> xmlPaserResult = this.getPaseredXml();
    CharSequence charsequence = this.compile(xmlPaserResult);
    this.fsa.generateFile("Library.kwdl", charsequence);
  }
  
  @Pure
  public String getOutpath() {
    return this.outpath;
  }
  
  public void setOutpath(final String outpath) {
    this.outpath = outpath;
  }
}
