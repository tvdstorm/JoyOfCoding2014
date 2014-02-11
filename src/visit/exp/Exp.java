package visit.exp;

public abstract class Exp {
	abstract <X> X accept(Visitor<X> v);
}
