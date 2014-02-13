package tweet.interp.size;


public class Post implements ITweet {
	private String user, text;

	public Post(String user, String text) {
		this.user = user;
		this.text = text;
	}
	
	@Override
	public String print() {
		return text + " (" + user + ")";
	}

	@Override
	public int size() {
		return text.length();
	}

}
