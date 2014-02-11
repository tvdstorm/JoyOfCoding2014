package mads.exp;

public interface PrintExp<C extends PrintExp<C>> extends EvalExp<C> {
	void print();
}
