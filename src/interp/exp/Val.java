package interp.exp;

public class Val extends Exp {
	private int n;

	public Val(int n) {
		this.n = n;
	}
	
	@Override
	int eval() {
		return n;
	}

}
