/*
 * generated by Xtext 2.23.0
 */
package xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import projet_UNO.IDM.ui.internal.IDMActivator;

public class MyUNOUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return IDMActivator.getInstance().getInjector("xtext.MyUNO");
	}

}