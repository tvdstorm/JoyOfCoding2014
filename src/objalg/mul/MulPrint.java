package objalg.mul;

import objalg.exp.ExpPrint;
import objalg.exp.ops.Print;

public class MulPrint extends ExpPrint implements MulAlg<Print> {
	public Print mul(final Print lhs, final Print rhs) {
		return new Print() {
			public String print() {
				return "(" + lhs.print() + "*" + rhs.print() + ")";
			}
		};
	}
}
