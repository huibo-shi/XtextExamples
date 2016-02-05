/*
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.kwdl.ui;

import com.google.inject.Injector;
import fr.itemis.xtext.example.kwdl.ui.internal.KwdlActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class KwdlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return KwdlActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return KwdlActivator.getInstance().getInjector(KwdlActivator.FR_ITEMIS_XTEXT_EXAMPLE_KWDL_KWDL);
	}
	
}
