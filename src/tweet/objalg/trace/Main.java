package tweet.objalg.trace;

import java.util.ArrayList;
import java.util.List;

import tweet.objalg.base.Hashtags;
import tweet.objalg.base.ITweetAlg;
import tweet.objalg.base.Print;
import tweet.objalg.print_and_hashtags.IPrintAndHashtags;
import tweet.objalg.print_and_hashtags.PrintAndHashtags;


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
		Trace t = new Trace(new PrintAndHashtags(new Print(), new Hashtags()));
		print(makeTweet(t));
		hashtags(makeTweet(t));
	}
}
