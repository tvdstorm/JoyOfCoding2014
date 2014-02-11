package mads.exp;

class PrintVal<C extends PrintExp<C>> extends EvalVal<C> implements PrintExp<C> {
	
	public PrintVal(int value) {
		super(value);
	}

	@Override
	public void print() {
		System.out.print(value);
	}

}
