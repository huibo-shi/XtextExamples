/*
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.test.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTestValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.itemis.xtext.example.test.test.TestPackage.eINSTANCE);
		return result;
	}
	
}