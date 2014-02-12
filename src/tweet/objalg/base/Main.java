package tweet.objalg.base;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static <X> X makeTweet(ITweetAlg<X> alg) {
		return alg.tweet("JoyOfCoding", "#Hello #world!");
	}
	
	static void print() {
		System.out.println(makeTweet(new Print()).print());
	}
	
	static void hashTags() {
		IHashtags t = makeTweet(new Hashtags());
		List<String> tags = new ArrayList<>();
		t.hashtags(tags);
		for (String tag: tags) {
			System.out.println(tag);
		}
	}
	
	public static void main(String[] args) {
		print();
		hashTags();
	}
}
