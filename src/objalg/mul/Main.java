package objalg.mul;


public class Main {
	static <A> A myMul(MulAlg<A> v) {
		return v.add(v.val(3), v.mul(v.val(3), v.val(3)));
	}

	public static void main(String[] args) {
		MulEval base = new MulEval();
		MulPrint print = new MulPrint();
		MulTrace trace = new MulTrace(base);
		MulEvalAndPrint debug = new MulEvalAndPrint(base, print);
		System.out.println(myMul(base).eval());
		System.out.println(myMul(print).print());
		System.out.println(myMul(trace).eval());
		System.out.println(myMul(debug).eval());
	}
}
