package org.eclipse.cdt.cross.arm.gnu.scannerconfig;

import org.eclipse.cdt.make.core.scannerconfig.IScannerInfoCollector3;
import org.eclipse.cdt.make.internal.core.scannerconfig2.PerProjectSICollector;
import org.eclipse.cdt.managedbuilder.scannerconfig.IManagedScannerInfoCollector;

/**
 * Implementation class for gathering the built-in compiler settings for
 * GCC-based targets. The assumption is that the tools will answer path
 * information in POSIX format and that the Scanner will be able to search for
 * files using this format.
 * 
 * @since 2.0
 */
public class ARMGCCScannerInfoCollector extends PerProjectSICollector implements
		IScannerInfoCollector3, IManagedScannerInfoCollector {
}
