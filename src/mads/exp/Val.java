package mads.exp;

public class Val<C extends Exp<C>> implements Exp<C> {
	protected int value;

	public Val(int n) {
		this.value = n;
	}
}
