package tweet.interp.retweet;

import tweet.interp.base.ITweet;

public class Retweet implements ITweet {
	private ITweet tweet;

	public Retweet(ITweet tweet) {
		this.tweet = tweet;
	}
	
	@Override
	public String print() {
		return "RT " + tweet.print();
	}
}
