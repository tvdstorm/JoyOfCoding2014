package objalg.exp;

public class Main {
	
	static <A> A myExp(ExpAlg<A> v) {
		return v.add(v.val(1), v.add(v.val(2), v.val(3)));
	}
	
	public static void main(String[] args) {
		ExpEval base = new ExpEval();
		ExpPrint print = new ExpPrint();
		ExpTrace trace = new ExpTrace(base);
		ExpEvalAndPrint evalPrint = new ExpEvalAndPrint(base, print);
		ExpEvalAndPrint traceEvalPrint = new ExpEvalAndPrint(trace, print);
		ExpTrace traceTrace = new ExpTrace(trace);
		System.out.println(myExp(base).eval());
		System.out.println(myExp(print).print());
		System.out.println(myExp(trace).eval());
		System.out.println(myExp(evalPrint).eval());
		System.out.println(myExp(traceEvalPrint).eval());
		System.out.println(myExp(traceTrace).eval());
	}
}
