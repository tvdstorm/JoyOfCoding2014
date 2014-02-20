package doc;

import java.util.List;

public class ToMarkdown implements IDocAlg<String> {

	@Override
	public String paragraph(String text) {
		return text + "\n\n";
	}

	@Override
	public String section(String title, List<String> xs) {
		StringBuilder sb = new StringBuilder();
		sb.append("### " + title + "\n\n");
		for (String x: xs) {
			sb.append(x);
		}
		return sb.toString();
	}

}
