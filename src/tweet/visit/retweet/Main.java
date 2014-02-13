package tweet.visit.retweet;

import tweet.visit.base.ITweet;
import tweet.visit.base.Post;

public class Main {

	public static void main(String[] args) {
		ITweet t = new Retweet(new Post("JoyOfCoding", "Hello world!"));
		System.out.println(t.accept(new PrintVisitor()));
	}
}
