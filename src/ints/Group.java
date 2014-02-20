package ints;

interface Group<S> extends Monoid<S> {
	S neg(S s);
}
