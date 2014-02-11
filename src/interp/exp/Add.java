package interp.exp;

public class Add extends Exp {
	private Exp lhs;
	private Exp rhs;

	public Add(Exp lhs, Exp rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	@Override
	int eval() {
		return lhs.eval() + rhs.eval();
	}

}
