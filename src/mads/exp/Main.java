package mads.exp;

public class Main {
	
	static PrintExpFix myExp() {
		return new PrintAddFix(new PrintValFix(1), 
				new PrintAddFix(new PrintValFix(2), new PrintValFix(3)));
	}
	
	public static void main(String[] args) {
		System.out.println(myExp().eval());
		myExp().print();
	}
}
