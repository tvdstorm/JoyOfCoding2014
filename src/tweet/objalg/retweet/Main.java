package tweet.objalg.retweet;


import java.util.ArrayList;
import java.util.List;

import tweet.objalg.base.IHashtags;
import tweet.objalg.base.IPrint;
import tweet.objalg.base.ITweetAlg;
import tweet.objalg.print_and_hashtags.IPrintAndHashtags;

public class Main {
	static <X> X makeTweet(IRetweetAlg<X> alg) {
		return alg.retweet(alg.post("JoyOfCoding", "#Hello #world!"));
	}
	
	static void print() {
		System.out.println(makeTweet(new Print()).print());
	}
	
	static void print2() {
		IRetweetAlg<IPrint> alg = new tweet.objalg.retweet.Print();
		IPrint printable = alg.retweet(alg.post("JoyOfCoding", "#Hello #world!"));
		System.out.println(printable.print());
	}
	
	static void hashTags() {
		IHashtags t = makeTweet(new Hashtags());
		List<String> tags = new ArrayList<>();
		t.hashtags(tags);
		for (String tag: tags) {
			System.out.println(tag);
		}
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
		print();
		hashTags();
		Trace t = new Trace(new PrintAndHashtags(new Print(), new Hashtags()));
		print(makeTweet(t));
		hashtags(makeTweet(t));
	}
}
