package tweet.visit.retweet;

import tweet.visit.base.ITweet;
import tweet.visit.base.Tweet;

public class Main {

	public static void main(String[] args) {
		ITweet t = new Retweet(new Tweet("JoyOfCoding", "Hello world!"));
		System.out.println(t.accept(new PrintVisitor()));
	}
}
