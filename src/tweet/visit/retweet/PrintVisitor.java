package tweet.visit.retweet;

public class PrintVisitor extends tweet.visit.base.PrintVisitor implements IVisitor<String> {
	@Override
	public String visit(Retweet retweet) {
		return "RT " + retweet.getTweet().accept(this);
	}

}
