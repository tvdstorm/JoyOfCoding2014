package mads.exp;

class EvalAdd<C extends EvalExp<C>> extends Add<C> implements EvalExp<C> {

	public EvalAdd(C lhs, C rhs) {
		super(lhs, rhs);
	}

	@Override
	public int eval() {
		return lhs.eval() + rhs.eval();
	}

}
