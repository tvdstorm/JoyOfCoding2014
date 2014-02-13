package ints;

public class Integers implements Group<Integer> {
	public Integer zero() {
		return 0;
	}

	public Integer add(Integer a, Integer b) {
		return a + b;
	}
}
