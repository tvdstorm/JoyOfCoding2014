package tweet.visit.base;

public class Reply implements ITweet {
	private String to;
	private ITweet tweet;

	public Reply(String to, ITweet tweet) {
		this.to = to;
		this.tweet = tweet;
	}
	
	public String getTo() { return to; }

	public ITweet getTweet() { return tweet; }
	
	@Override
	public <X> X accept(IVisitor<X> v) {
		return v.visit(this);
	}

}
