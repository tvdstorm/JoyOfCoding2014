package ints;

class Ints implements IntAlg<Integer> {
	public Integer con(Integer n) { 
		return n; 
	}
	
	public Integer add(Integer a, Integer b) { 
		return a + b; 
	}
	
	public Integer mul(Integer a, Integer b) { 
		return a * b; 
	}
	
	public static void main(String[] args) {
		Ints i = new Ints();
		int x = i.add(i.con(1), i.mul(i.con(2), i.con(3)));
		System.out.println(x);
	}
}
