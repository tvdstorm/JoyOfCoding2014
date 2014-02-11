package objalg.exp;

import objalg.exp.ops.Eval;

public class ExpTrace implements ExpAlg<Eval >{
	private ExpAlg<Eval> eval;
	
	public ExpTrace(ExpAlg<Eval> eval) {
		this.eval = eval;
	}

	protected abstract class Trace implements Eval {
		private Eval exp;

		public Trace(Eval exp) {
			this.exp = exp;
		}
		
		@Override
		public int eval() {
			return exp.eval();
		}
	}
	
	
	@Override
	public Eval add(Eval lhs, Eval rhs) {
		return new Trace(eval.add(lhs, rhs)) {
			@Override
			public int eval() {
				System.out.println("add");
				return super.eval();
			}
		};
	}

	@Override
	public Eval val(int n) {
		return new Trace(eval.val(n)) {
			@Override
			public int eval() {
				System.out.println("val");
				return super.eval();
			}
		};
	}


}
