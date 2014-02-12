package tweet.objalg.base;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HashTags implements ITweetAlg<IHashTags> {

	final static Pattern hashTag = Pattern.compile("#[a-zA-Z0-9_]+");
	
	@Override
	public IHashTags tweet(String user, final String text) {
		return new IHashTags() {
			@Override
			public void hashTags(List<String> tags) {
				Matcher m = hashTag.matcher(text);
				while (m.find())  
					tags.add(m.group());
			}
		};
	}

	@Override
	public IHashTags reply(String to , final IHashTags tweet) {
		return new IHashTags() {
			@Override
			public void hashTags(List<String> tags) {
				tweet.hashTags(tags);
			}
		};
	}

}
