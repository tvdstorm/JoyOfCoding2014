package tweet.objalg.print_and_size;

import tweet.objalg.base.ITweetAlg;
import tweet.objalg.base.Print;
import tweet.objalg.base.Size;


public class Main {
	static <X> X makeTweet(ITweetAlg<X> alg) {
		return alg.post("JoyOfCoding", "#Hello #world!");
	}
	
	static void print(IPrintAndSize ph) {
		System.out.println(ph.print());
	}
	
	static void size(IPrintAndSize ph) {
		System.out.println(ph.size());
	}

	
	
	public static void main(String[] args) {
		IPrintAndSize ps = 
			new PrintAndSize(new Print(), new Size())
				.post("JoyOfCoding", "#Hello #world!");
		ps.print();
		ps.size();
		print(ps);
		size(ps);
	}
}
