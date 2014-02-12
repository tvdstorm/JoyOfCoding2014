package tweet.visit.base;

public interface IVisitor<X> {
	X visit(Tweet tweet);
	X visit(Reply reply);
}
