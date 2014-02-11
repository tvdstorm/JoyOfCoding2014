package objalg.mul;

import objalg.exp.ExpEvalAndPrint;
import objalg.exp.ops.Eval;
import objalg.exp.ops.EvalAndPrint;
import objalg.exp.ops.Print;

public class MulEvalAndPrint extends ExpEvalAndPrint implements MulAlg<EvalAndPrint> {
	private MulAlg<Eval> eval;
	private MulAlg<Print> print;

	public MulEvalAndPrint(MulAlg<Eval> eval, MulAlg<Print> print) {
		super(eval, print);
		this.eval = eval;
		this.print = print;
	}

	@Override
	public EvalAndPrint mul(EvalAndPrint lhs, EvalAndPrint rhs) {
		final Eval e = eval.mul(lhs, rhs);
		final Print p = print.mul(lhs, rhs);
		return new EvalAndPrint() {
			public String print() { return p.print(); }
			public int eval() { return e.eval(); }
		};
	}

}
