package tweet.visit.base;


public class SizeVisitor implements IVisitor<Integer> {
	@Override
	public Integer visit(Tweet tweet) {
		return tweet.getText().length();
	}

	@Override
	public Integer visit(Reply reply) {
		return 1 + reply.getTo().length() + 1 + reply.getTweet().accept(this);
	}
}
