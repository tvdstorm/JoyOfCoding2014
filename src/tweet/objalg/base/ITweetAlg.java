package tweet.objalg.base;


public interface ITweetAlg<X> {
	X post(String user, String text);
	X reply(String to, X tweet);
}
