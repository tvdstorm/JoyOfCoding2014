package visit.exp;

public class Add extends Exp {
	private Exp lhs;
	private Exp rhs;

	public Add(Exp lhs, Exp rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public Exp getLhs() {
		return lhs;
	}
	
	public Exp getRhs() {
		return rhs;
	}
	
	@Override
	<X> X accept(Visitor<X> v) {
		return v.visit(this);
	}

}
