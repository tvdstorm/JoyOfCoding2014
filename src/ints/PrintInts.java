package ints;

public class PrintInts implements IntAlg<String> {
	public String con(Integer n) { 
		return n.toString(); 
	}
	
	public String add(String a, String b) { 
		return a + " + " + b; 
	}
	
	public String mul(String a, String b) { 
		return a + " * " + b; 
	}
	
	public static void main(String[] args) {
		PrintInts i = new PrintInts();
		String x = i.add(i.con(1), i.mul(i.con(2), i.con(3)));
		System.out.println(x);
	}

}
