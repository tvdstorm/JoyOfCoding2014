package mads.exp;

public class PrintAddFix extends PrintAdd<PrintExpFix> implements PrintExpFix {
	public PrintAddFix(PrintExpFix lhs, PrintExpFix rhs) {
		super(lhs, rhs);
	}
}
