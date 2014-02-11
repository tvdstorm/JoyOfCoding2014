package mads.mul;

import mads.exp.PrintExp;

public class PrintMul<C extends PrintExp<C>> extends EvalMul<C> implements PrintExp<C> {

	public PrintMul(C lhs, C rhs) {
		super(lhs, rhs);
	}

	@Override
	public void print() {
		lhs.print();
		System.out.print(" * ");
		rhs.print();
	}

}
