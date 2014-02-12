package tweet.objalg.retweet;

import java.util.List;

import tweet.objalg.base.IHashtags;

public class Hashtags extends tweet.objalg.base.Hashtags implements IRetweetAlg<IHashtags> {
	@Override
	public IHashtags retweet(final IHashtags tweet) {
		return new IHashtags() {
			
			@Override
			public void hashtags(List<String> tags) {
				tweet.hashtags(tags);
			}
		};
	}

}
