package tweet.visit.base;

public class Post implements ITweet {
	private String user;
	private String text;

	public Post(String user, String text) {
		this.user = user;
		this.text = text;
	}

	public String getText() { return text; }
	
	public String getUser() { return user; }
	
	@Override
	public <X> X accept(IVisitor<X> v) {
		return v.visit(this);
	}
	

}
