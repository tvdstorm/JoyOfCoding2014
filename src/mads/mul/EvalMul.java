package mads.mul;

import mads.exp.EvalExp;

public class EvalMul<C extends EvalExp<C>> extends Mul<C> implements EvalExp<C> {

	public EvalMul(C lhs, C rhs) {
		super(lhs, rhs);
	}

	@Override
	public int eval() {
		return lhs.eval() * rhs.eval();
	}

}
