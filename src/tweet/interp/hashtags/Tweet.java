package tweet.interp.hashtags;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tweet implements ITweet {

	final static Pattern hashTag = Pattern.compile("#[a-zA-Z0-9_]+");
	
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

	@Override
	public void hashTags(List<String> tags) {
		Matcher m = hashTag.matcher(text);
		while (m.find()) {
			tags.add(m.group());
		}
	}

}
