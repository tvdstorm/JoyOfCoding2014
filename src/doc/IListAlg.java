package doc;

import java.util.List;

public interface IListAlg<X> extends IDocAlg<X> {
	X itemize(List<X> xs);
	X enumerate(List<X> xs);
}
