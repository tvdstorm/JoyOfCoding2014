package tweet.objalg.base;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hashtags implements ITweetAlg<IHashtags> {
	final static Pattern hashTag = Pattern.compile("#[a-zA-Z0-9_]+");
	
	@Override
	public IHashtags tweet(String user, final String text) {
		return new IHashtags() {
			@Override
			public void hashtags(List<String> tags) {
				Matcher m = hashTag.matcher(text);
				while (m.find())  
					tags.add(m.group());
			}
		};
	}

	@Override
	public IHashtags reply(String to , final IHashtags tweet) {
		return new IHashtags() {
			@Override
			public void hashtags(List<String> tags) {
				tweet.hashtags(tags);
			}
		};
	}

}
