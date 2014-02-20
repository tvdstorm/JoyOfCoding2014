package ints;

public interface CtxAlg<C, T> {
	C top();
	C abs1(String var, C ctx);
	C app1(C ctx, T trm);
	C app2(T trm, C ctx);
	C if1(C ctx, T t1, T t2);
	C if2(T t1, C ctx, T t2);
	C if3(T t1, T t2, C ctx);
}

interface LamAlg<T> {
	T var(String x);
	T abs(String x, T body);
	T appl(T t1, T t2);
	T if_(T t1, T t2, T t3);
}

class Loc<X, C> {
	private X x;
	private C ctx;

	public Loc(X x, C ctx) {
		this.x = x;
		this.ctx = ctx;
	}
}



interface ICtx<X> {
	Loc<X, ICtx<X>> up(X x);
	Loc<X, ICtx<X>> left(X x);
	Loc<X, ICtx<X>> right(X x);
}

class Ctx<X> implements CtxAlg<ICtx<X>, X> {
	private LamAlg<X> fact; 
	
	@Override
	public ICtx<X> top() {
		return new ICtx<X>() {

			@Override
			public Loc<X, ICtx<X>> up(X x) {
				return new Loc<X, ICtx<X>>(x, this);
			}

			@Override
			public Loc<X, ICtx<X>> left(X x) {
				return new Loc<X, ICtx<X>>(x, this);
			}

			@Override
			public Loc<X, ICtx<X>> right(X x) {
				return new Loc<X, ICtx<X>>(x, this);
			}
		};
	}

	@Override
	public ICtx<X> abs1(final String var, final ICtx<X> ctx) {
		return new ICtx<X>() {

			@Override
			public Loc<X, ICtx<X>> up(X x) {
				return new Loc<X, ICtx<X>>(fact.abs(var, x), ctx);
			}

			@Override
			public Loc<X, ICtx<X>> left(X x) {
				return new Loc<X, ICtx<X>>(x, this);
			}

			@Override
			public Loc<X, ICtx<X>> right(X x) {
				return new Loc<X, ICtx<X>>(x, this);
			}
		};
	}

	@Override
	public ICtx<X> app1(final ICtx<X> ctx, final X trm) {
		return new ICtx<X>() {

			@Override
			public Loc<X, ICtx<X>> up(X x) {
				return new Loc<X, ICtx<X>>(fact.appl(x, trm), ctx);
			}

			@Override
			public Loc<X, ICtx<X>> left(X x) {
				return new Loc<X, ICtx<X>>(trm, this);
			}

			@Override
			public Loc<X, ICtx<X>> right(X x) {
				return new Loc<X, ICtx<X>>(trm, app2(x, ctx));
			}
		};
	}

	@Override
	public ICtx<X> app2(X trm, ICtx<X> ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICtx<X> if1(ICtx<X> ctx, X t1, X t2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICtx<X> if2(X t1, ICtx<X> ctx, X t2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICtx<X> if3(X t1, X t2, ICtx<X> ctx) {
		// TODO Auto-generated method stub
		return null;
	}
}



//
//interface Down<X, C> {
//	Loc<X, C> down(C c);
//}
//
//class Zip<X> implements LamAlg<Move<X>> {
//
//	@Override
//	public Loc<X, T> abs(String x, Move<X> e) {
//		return new Zipper() {
//			Loc<X> down(Context<X> ctx) {
//				return new Loc(e.getIt(), ctx);
//			}
//			Loc<X> up(Context<X> c) 
//		}
//	}
//
//	@Override
//	public Loc<X, T> appl(Loc<X, T> t1, Loc<X, T> t2) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Loc<X, T> if_(Loc<X, T> t1, Loc<X, T> t2, Loc<X, T> t3) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Down<X, C> var(String x) {
//
//			@Override
//			public Loc<X, C> down(C c) {
//				
//			}
//		};
//	}
//	
//}
//
//interface Move<C, T> {
//	Loc<C, T> down(T t, C c);
//}