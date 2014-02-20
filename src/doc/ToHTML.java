package doc;

import java.util.List;

public class ToHTML implements IDocAlg<String> {

	@Override
	public String paragraph(String text) {
		return "<p>\n" + text + "</p>\n";
	}

	@Override
	public String section(String title, List<String> xs) {
		StringBuilder sb = new StringBuilder();
		sb.append("<h1>" + title + "</h1>\n");
		for (String x: xs) {
			sb.append(x);
		}
		return sb.toString();
	}

}
