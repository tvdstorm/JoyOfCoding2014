package visit.exp;

public class Eval implements Visitor<Integer> {

	@Override
	public Integer visit(Add x) {
		return x.getLhs().accept(this) + x.getRhs().accept(this);
	}

	@Override
	public Integer visit(Val x) {
		return x.getValue();
	}

}
