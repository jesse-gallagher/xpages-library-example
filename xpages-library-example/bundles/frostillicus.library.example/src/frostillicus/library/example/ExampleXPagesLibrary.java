package frostillicus.library.example;

import com.ibm.xsp.library.AbstractXspLibrary;

import org.openntf.domino.xsp.XspLibrary;
import org.osgi.framework.FrameworkUtil;

public class ExampleXPagesLibrary extends AbstractXspLibrary {
	public static final String LIBRARY_ID = ExampleXPagesLibrary.class.getPackage().getName();

	public String getLibraryId() {
		return LIBRARY_ID;
	}

	public boolean isDefault() { return true; }

	@Override
	public String getPluginId() {
		return FrameworkUtil.getBundle(getClass()).getSymbolicName();
	}

	@Override
	public String[] getDependencies() {
		return new String[] {
			"com.ibm.xsp.core.library", //$NON-NLS-1$
			"com.ibm.xsp.extsn.library", //$NON-NLS-1$
			"com.ibm.xsp.domino.library", //$NON-NLS-1$
			"com.ibm.xsp.extlib.library", //$NON-NLS-1$
			XspLibrary.LIBRARY_ID
		};
	}
}