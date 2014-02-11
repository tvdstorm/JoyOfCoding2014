package mads.exp;

class EvalVal<C extends EvalExp<C>> extends Val<C> implements EvalExp<C> {
	
	public EvalVal(int value) {
		super(value);
	}

	@Override
	public int eval() {
		return value;
	}

}
