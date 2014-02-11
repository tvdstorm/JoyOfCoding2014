package objalg.exp;

import objalg.exp.ops.Eval;
import objalg.exp.ops.EvalAndPrint;
import objalg.exp.ops.Print;

public class ExpEvalAndPrint implements ExpAlg<EvalAndPrint> {
	private ExpAlg<Eval> eval;
	private ExpAlg<Print> print;

	public ExpEvalAndPrint(ExpAlg<Eval> eval, ExpAlg<Print> print) {
		this.eval = eval;
		this.print = print;
	}
	
	@Override
	public EvalAndPrint add(EvalAndPrint lhs, EvalAndPrint rhs) {
		final Eval e = eval.add(lhs, rhs);
		final Print p = print.add(lhs, rhs);
		return new EvalAndPrint() {
			public String print() { return p.print(); }
			public int eval() { return e.eval(); }
		};
	}

	@Override
	public EvalAndPrint val(int n) {
		final Eval e = eval.val(n);
		final Print p = print.val(n);
		return new EvalAndPrint() {
			public String print() { return p.print(); }
			public int eval() { return e.eval(); }
		};
	}
}
