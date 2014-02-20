package ints;

class Booleans implements Monoid<Boolean> {
	public Boolean add(Boolean a, Boolean b) {
		return a || b;
	}

	public Boolean zero() {
		return false;
	}
}
