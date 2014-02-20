package ints;

interface Ring<S> extends Group<S> {
	S mul(S a, S b);
	S one();
}
