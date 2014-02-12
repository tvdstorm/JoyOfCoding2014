package tweet.objalg.retweet;

import tweet.objalg.base.ISize;

public class Size extends tweet.objalg.base.Size implements IRetweetAlg<ISize> {
	@Override
	public ISize retweet(final ISize tweet) {
		return new ISize() {
			@Override
			public int size() {
				return 3 + tweet.size();
			}
		};
	}
}
