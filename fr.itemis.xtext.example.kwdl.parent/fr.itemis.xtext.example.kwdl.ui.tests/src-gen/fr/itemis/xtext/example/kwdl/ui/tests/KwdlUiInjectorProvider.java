/*
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.kwdl.ui.tests;

import com.google.inject.Injector;
import fr.itemis.xtext.example.kwdl.ui.internal.KwdlActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class KwdlUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return KwdlActivator.getInstance().getInjector("fr.itemis.xtext.example.kwdl.Kwdl");
	}

}