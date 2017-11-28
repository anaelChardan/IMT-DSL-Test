/*
 * generated by Xtext 2.12.0
 */
package org.anaelchardan.guiexercice.ui;

import com.google.inject.Injector;
import org.anaelchardan.guiexercice.ui.internal.GuiexerciceActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GuiexerciceExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GuiexerciceActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GuiexerciceActivator.getInstance().getInjector(GuiexerciceActivator.ORG_ANAELCHARDAN_GUIEXERCICE_GUIEXERCICE);
	}
	
}
