package tweet.interp.retweet_with_size;

import tweet.interp.size.ITweet;
import tweet.interp.size.Tweet;

public class Main {
	public static void main(String[] args) {
		ITweet t = new Retweet(new Tweet("JoyOfCoding", "#Hello #world!"));
		System.out.println(t.size());
	}
}
