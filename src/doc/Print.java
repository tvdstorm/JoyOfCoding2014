package doc;

import java.util.List;

public class Print implements IDocAlg<IPrint> {

	@Override
	public IPrint paragraph(final String text) {
		return new IPrint() {
			@Override
			public String print(IDocAlg<? extends IPrint> self) {
				return text;
			}
		};
	}

	@Override
	public IPrint section(final String title, final List<IPrint> xs) {
		return new IPrint() {
			
			@Override
			public String print(IDocAlg<? extends IPrint> self) {
				StringBuilder sb = new StringBuilder();
				sb.append("### " + title + "\n\n");
				for (IPrint x: xs) {
					sb.append(x);
				}
				return sb.toString();			}
		};
	}

}
