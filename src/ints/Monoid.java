package ints;

interface Monoid<S> {
	S add(S a, S b);
	S zero();
}
