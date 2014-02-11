package visit.exp;

public class Val extends Exp {
	private int value;

	public Val(int n) {
		this.value = n;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	<X> X accept(Visitor<X> v) {
		return v.visit(this);
	}

}
