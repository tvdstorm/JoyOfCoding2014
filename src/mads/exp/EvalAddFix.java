package mads.exp;

public class EvalAddFix extends EvalAdd<EvalExpFix> implements EvalExpFix {
	public EvalAddFix(EvalExpFix lhs, EvalExpFix rhs) {
		super(lhs, rhs);
	}
}
