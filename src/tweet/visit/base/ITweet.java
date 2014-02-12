package tweet.visit.base;

public interface ITweet {
	<X> X accept(IVisitor<X> v);
}
