package mads.exp;

public interface EvalExp<C extends EvalExp<C>> extends Exp<C> {
	int eval();
}
