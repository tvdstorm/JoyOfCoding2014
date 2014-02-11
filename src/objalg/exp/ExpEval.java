package objalg.exp;

import objalg.exp.ops.Eval;



public class ExpEval implements ExpAlg<Eval> {
	public Eval val(final int n) {
		return new Eval() {
			@Override
			public int eval() {
				return n;
			}
		};
	}
	
	public Eval add(final Eval lhs, final Eval rhs) {
		return new Eval() {
			@Override
			public int eval() {
				return lhs.eval() + rhs.eval();
			}
		};
	}
}
