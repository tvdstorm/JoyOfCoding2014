package visit.exp;

public interface Visitor<X> {
	X visit(Add x);
	X visit(Val x);
}
