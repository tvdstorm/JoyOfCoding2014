package files.base;

public interface IPathAlg<X> {
	X root();
	X path(X parent, String name);
}
