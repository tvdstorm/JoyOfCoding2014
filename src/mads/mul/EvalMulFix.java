package mads.mul;

import mads.exp.EvalExpFix;

public class EvalMulFix extends EvalMul<EvalExpFix> implements EvalExpFix {
	public EvalMulFix(EvalExpFix lhs, EvalExpFix rhs) {
		super(lhs, rhs);
	}
}
