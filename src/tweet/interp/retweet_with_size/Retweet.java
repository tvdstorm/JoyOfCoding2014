package tweet.interp.retweet_with_size;

import tweet.interp.size.ITweet;

public class Retweet implements ITweet {
	private ITweet tweet;

	public Retweet(ITweet tweet) {
		this.tweet = tweet;
	}
	
	@Override
	public String print() {
		return "RT " + tweet.print();
	}

	@Override
	public int size() {
		return 3 + tweet.size();
	}

}
