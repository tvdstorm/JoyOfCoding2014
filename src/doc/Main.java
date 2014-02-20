package doc;

import static java.util.Arrays.asList;

public class Main {

	static <X> X makeDoc(IDocAlg<X> alg) {
		return alg.section("Joy of Coding", 
				asList(alg.paragraph("This the joy of coding")));
				
	}
	
	public static void main(String[] args) {
		ToHTML h = new ToHTML();
		ToMarkdown m = new ToMarkdown();
		System.out.println(makeDoc(h));
		System.out.println(makeDoc(m));
	}
	
}
