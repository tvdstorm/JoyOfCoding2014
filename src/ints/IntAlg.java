package ints;

import  static java.util.Arrays.asList;

import java.util.List;



public interface IntAlg<X> {
	X con(Integer n); 
	X add(X a, X b); 
	X mul(X a, X b); 
}


interface ITest {
	ITest isAdd();
	ITest isMul();
	ITest isCon();
	ITest getArg(int i);
	boolean isTrue();
}

class TestIt implements ITest {
	static final ITest FALSE = new ITest() {
		public boolean isTrue() { return false; }
		public ITest isAdd() { return this; }
		public ITest isCon() { return this; }
		public ITest isMul() { return this; }
		public ITest getArg(int i) { return this; }
	};
	private ITest[] args;
	
	public TestIt(ITest ...args) {
		this.args = args;
	}
	
	public ITest isAdd() {
		return FALSE;
	}
	public ITest isMul() {
		return FALSE;
	}
	
	public ITest isCon() {
		return FALSE;
	}
	
	public ITest getArg(int i) {
		if (i < args.length) {
			return args[i];
		}
		throw new UnsupportedOperationException();
	}
	@Override
	public boolean isTrue() {
		return true;
	}
}

class Test implements IntAlg<ITest> {

	@Override
	public ITest con(Integer n) {
		return new TestIt() {
			public ITest isCon() { return this; }
		};
	}

	@Override
	public ITest add(ITest a, ITest b) {
		return new TestIt(a, b) {
			public ITest isAdd() { return this; }
		};
	}

	@Override
	public ITest mul(ITest a, ITest b) {
		return new TestIt(a, b) {
			public ITest isAdd() { return this; }
		};
	}
	
	
	
}
