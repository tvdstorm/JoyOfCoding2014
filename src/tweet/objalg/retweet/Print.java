package tweet.objalg.retweet;

import tweet.objalg.base.IPrint;

public class Print extends tweet.objalg.base.Print implements RetweetAlg<IPrint> {
	@Override
	public IPrint retweet(final IPrint tweet) {
		return new IPrint() {
			@Override
			public String print() {
				return "RT " + tweet.print();
			}
		};
	}

}
