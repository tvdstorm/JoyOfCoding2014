package tweet.objalg.retweet;

import java.util.List;

import tweet.objalg.base.IHashTags;

public class HashTags extends tweet.objalg.base.HashTags implements RetweetAlg<IHashTags> {
	@Override
	public IHashTags retweet(final IHashTags tweet) {
		return new IHashTags() {
			
			@Override
			public void hashTags(List<String> tags) {
				tweet.hashTags(tags);
			}
		};
	}

}
