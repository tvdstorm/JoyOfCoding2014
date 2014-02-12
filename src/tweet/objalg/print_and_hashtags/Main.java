package tweet.objalg.print_and_hashtags;

import java.util.ArrayList;
import java.util.List;

import tweet.objalg.base.Hashtags;
import tweet.objalg.base.ITweetAlg;
import tweet.objalg.base.Print;


public class Main {
	static <X> X makeTweet(ITweetAlg<X> alg) {
		return alg.tweet("JoyOfCoding", "#Hello #world!");
	}
	
	static void print(IPrintAndHashtags ph) {
		System.out.println(ph.print());
	}
	
	static void hashtags(IPrintAndHashtags ph) {
		List<String> tags = new ArrayList<>();
		ph.hashtags(tags);
		for (String tag: tags) {
			System.out.println(tag);
		}
	}
	
	public static void main(String[] args) {
		Print p = new Print();
		Hashtags h = new Hashtags();
		IPrintAndHashtags ph = makeTweet(new PrintAndHashtags(p, h));
		print(ph);
		hashtags(ph);
	}
}
