package tweet.interp.base;

public class Tweet implements ITweet {

	private String user;
	private String text;

	public Tweet(String user, String text) {
		this.user = user;
		this.text = text;
	}
	
	@Override
	public String print() {
		return text + " (" + user + ")";
	}

}
