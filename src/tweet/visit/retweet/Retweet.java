package tweet.visit.retweet;

import tweet.visit.base.ITweet;

public class Retweet implements ITweet {
	private ITweet tweet;

	public Retweet(ITweet tweet) {
		this.tweet = tweet;
	}
	
	public ITweet getTweet() {
		return tweet;
	}

	@Override
	public <X> X accept(tweet.visit.base.IVisitor<X> v) {
		return ((IVisitor<X>)v).visit(this);
	}
	
}
