package tweet.visit.base;


public class PrintVisitor implements IVisitor<String> {
	@Override
	public String visit(Tweet tweet) {
		return tweet.getText() + " (" + tweet.getUser() + ")";
	}

	@Override
	public String visit(Reply reply) {
		return "@" + reply.getTo() + " " +  reply.accept(this);
	}

}
