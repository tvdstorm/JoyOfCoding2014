package tweet.interp.rt_and_htags;

import java.util.List;

import tweet.interp.hashtags.ITweet;

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
	public void hashTags(List<String> tags) {
		tweet.hashTags(tags);
	}

	
}
