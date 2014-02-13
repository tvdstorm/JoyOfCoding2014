package tweet.visit.base;

public interface IVisitor<X> {
	X visit(Post tweet);
	X visit(Reply reply);
}
