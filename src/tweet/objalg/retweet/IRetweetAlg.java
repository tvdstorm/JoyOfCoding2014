package tweet.objalg.retweet;

import tweet.objalg.base.ITweetAlg;

public interface IRetweetAlg<T> extends ITweetAlg<T> {
	T retweet(T t);
}
