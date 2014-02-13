package tweet.interp.base;

public class Post implements ITweet {

	private String user;
	private String text;

	public Post(String user, String text) {
		this.user = user;
		this.text = text;
	}
	
	@Override
	public String print() {
		return text + " (" + user + ")";
	}

}
