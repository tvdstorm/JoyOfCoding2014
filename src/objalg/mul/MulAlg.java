package objalg.mul;

import objalg.exp.ExpAlg;

public interface MulAlg<X> extends ExpAlg<X> {
	X mul(X lhs, X rhs);
}
