package doc;

public interface IPrint {
	String print(IDocAlg<? extends IPrint> self);
}
