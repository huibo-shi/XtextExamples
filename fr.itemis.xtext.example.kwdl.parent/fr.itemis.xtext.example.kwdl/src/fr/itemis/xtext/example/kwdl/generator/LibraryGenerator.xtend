package fr.itemis.xtext.example.kwdl.generator

import com.google.inject.Inject
import fr.itemis.xtext.example.kwdl.KwdlRuntimeModule
import fr.itemis.xtext.example.kwdl.KwdlStandaloneSetup
import fr.itemis.xtext.example.kwdl.kwdl.Keyword
import fr.itemis.xtext.example.kwdl.kwdl.KwdlFactory
import fr.itemis.xtext.example.kwdl.kwdl.Parameter
import java.util.ArrayList
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import org.eclipse.emf.mwe2.runtime.Mandatory
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.JavaIoFileSystemAccess

class LibraryGenerator extends AbstractWorkflowComponent2 {
	protected IFileSystemAccess fsa
	
	@Accessors String outpath
	
	new(){
		new KwdlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}

	@Mandatory
	def setOutputFolder(String path) {
		outpath = path
	}

	def getPaseredXml() {
		val result = <Keyword>newArrayList
		result.add(KwdlFactory.eINSTANCE.createKeyword => [
			name = "OpenBrowser";
			parameters.add(KwdlFactory.eINSTANCE.createParameter => [
				name = "type"
				optional = false
				defaultValue = "iexplorer"
				valuePool.add("iexplorer")
				valuePool.add("firefox")
				valuePool.add("chrome")
			])
			parameters.add(KwdlFactory.eINSTANCE.createParameter => [
				name = "url"
				optional = true
			])
		])
		result
	}

	def compile(ArrayList<Keyword> keywords) '''
		«FOR keyword : keywords»
			keyword «keyword.name» {
				«FOR parameter : keyword.parameters»
					«IF parameter.optional»
						optional parameter «parameter.name» «parameter.compileParameterBody»
					«ELSE»
						parameter «parameter.name» «parameter.compileParameterBody»
					«ENDIF»
				«ENDFOR»
			}
		«ENDFOR»
	'''

	def compileParameterBody(Parameter parameter) '''
		«IF parameter.defaultValue != null»{
			DefaultValue : «parameter.defaultValue»
			«IF !parameter.valuePool.empty»
				ValuePool : [«parameter.valuePool.join(",")»]
			«ENDIF»
		}
		«ELSEIF !parameter.valuePool.empty»{
			ValuePool : [«parameter.valuePool.join(",")»]
		}
		«ENDIF»
	'''

	override protected invokeInternal(WorkflowContext arg0, ProgressMonitor arg1, Issues arg2) {
		fsa = new JavaIoFileSystemAccess
		var xmlPaserResult = paseredXml
		var charsequence = xmlPaserResult.compile
		fsa.generateFile("Library.kwdl", charsequence)
	}

}
