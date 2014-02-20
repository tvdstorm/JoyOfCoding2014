package vcs;

public interface ICommitAlg<X> {
	X init();
	X commit(String msg);
	X merge(X c1, X c2);
	

}
