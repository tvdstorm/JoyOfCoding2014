package doc;

import java.util.List;

public interface IDocAlg<X> {
	X paragraph(String text);
	X section(String title, List<X> xs);
}
