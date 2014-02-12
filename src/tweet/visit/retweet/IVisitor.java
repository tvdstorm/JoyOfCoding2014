package tweet.visit.retweet;

public interface IVisitor<X> extends tweet.visit.base.IVisitor<X> {
	X visit(Retweet retweet);
}
