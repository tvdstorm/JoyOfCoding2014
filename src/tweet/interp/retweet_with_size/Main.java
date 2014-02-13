package tweet.interp.retweet_with_size;

import tweet.interp.size.ITweet;
import tweet.interp.size.Post;

public class Main {
	public static void main(String[] args) {
		ITweet t = new Retweet(new Post("JoyOfCoding", "#Hello #world!"));
		System.out.println(t.size());
	}
}
