package objalg.exp;

import objalg.exp.ops.Print;


public class ExpPrint implements ExpAlg<Print> {
	public Print val(final int n) {
		return new Print() {
			public String print() {
				return "" + n;
			}
		};
	}

	public Print add(final Print lhs, final Print rhs) {
		return new Print() {
			public String print() {
				return "(" + lhs.print() + "+" + rhs.print() + ")";
			}
		};
	}
}
