package mads.exp;

public class Add<C extends Exp<C>> implements Exp<C> {
	protected C lhs;
	protected C rhs;

	public Add(C lhs, C rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

}
