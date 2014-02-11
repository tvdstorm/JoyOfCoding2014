package objalg.mul;

import objalg.exp.ExpEval;
import objalg.exp.ops.Eval;

public class MulEval extends ExpEval implements MulAlg<Eval> {
	public Eval mul(final Eval lhs, final Eval rhs) { 
		return new Eval() {
			@Override
			public int eval() {
				return lhs.eval() * rhs.eval();
			}
		};
	}
}
