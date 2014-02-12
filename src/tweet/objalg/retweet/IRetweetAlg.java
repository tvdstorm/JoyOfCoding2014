package tweet.objalg.retweet;

import tweet.objalg.base.ITweetAlg;

public interface IRetweetAlg<X> extends ITweetAlg<X> {
	X retweet(X t);
}
