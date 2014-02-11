package objalg.exp;

public interface ExpAlg<X> {
	X val(int n);
	X add(X lhs, X rhs);
}
