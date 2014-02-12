package tweet.interp.hashtags;

import java.util.List;

public class Reply implements ITweet {
	private String to;
	private ITweet tweet;

	public Reply(String to, ITweet tweet) {
		this.to = to;
		this.tweet = tweet;
	}
	
	@Override
	public String print() {
		return "@" + to + " " + tweet.print();
	}

	@Override
	public void hashTags(List<String> tags) {
		tweet.hashTags(tags);
	}

}
