package tweet.objalg.retweet;

import tweet.objalg.base.IPrint;

public class Print extends tweet.objalg.base.Print implements IRetweetAlg<IPrint> {
	public IPrint retweet(final IPrint tweet) {
		return new IPrint() {
			public String print() {
				return "RT " + tweet.print();
			}
		};
	}
}
