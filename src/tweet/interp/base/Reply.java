package tweet.interp.base;

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

}
