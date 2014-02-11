package mads.mul;

import mads.exp.PrintExpFix;

public class PrintMulFix extends PrintMul<PrintExpFix> implements PrintExpFix {
	public PrintMulFix(PrintExpFix lhs, PrintExpFix rhs) {
		super(lhs, rhs);
	}
}
