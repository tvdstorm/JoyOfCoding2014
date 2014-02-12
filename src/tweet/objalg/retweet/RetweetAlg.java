package tweet.objalg.retweet;

import tweet.objalg.base.ITweetAlg;

public interface RetweetAlg<T> extends ITweetAlg<T> {
	T retweet(T t);
}
