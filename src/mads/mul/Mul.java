package mads.mul;

import mads.exp.Exp;

public class Mul<C extends Exp<C>> implements Exp<C> {
	protected C lhs;
	protected C rhs;
	
	public Mul(C lhs, C rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
}
