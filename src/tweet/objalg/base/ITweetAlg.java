package tweet.objalg.base;


public interface ITweetAlg<X> {
	X tweet(String user, String text);
	X reply(String to, X tweet);
}
