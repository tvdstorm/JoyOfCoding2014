package objalg.mul;

import objalg.exp.ExpTrace;
import objalg.exp.ops.Eval;

public class MulTrace extends ExpTrace implements MulAlg<Eval> {
	private MulAlg<Eval> eval;
	
	public MulTrace(MulAlg<Eval> eval) {
		super(eval);
		this.eval = eval;
	}

	@Override
	public Eval mul(Eval lhs, Eval rhs) {
		return new Trace(eval.mul(lhs, rhs)) {
			@Override
			public int eval() {
				System.out.println("mul");
				return super.eval();
			}
		};
	}


}
