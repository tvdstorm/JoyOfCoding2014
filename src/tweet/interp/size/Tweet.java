package tweet.interp.size;

import static java.util.regex.Pattern.compile;

import java.util.List;
import java.util.regex.Matcher;

public class Tweet implements ITweet {
	private String user, text;

	public Tweet(String user, String text) {
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
