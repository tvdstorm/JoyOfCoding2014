package mads.exp;

class PrintAdd<C extends PrintExp<C>> extends EvalAdd<C> implements PrintExp<C> {

	public PrintAdd(C lhs, C rhs) {
		super(lhs, rhs);
	}

	@Override
	public void print() {
		lhs.print();
		System.out.print(" + ");
		rhs.print();
	}

}
