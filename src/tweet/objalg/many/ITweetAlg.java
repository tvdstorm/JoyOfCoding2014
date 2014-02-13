package tweet.objalg.many;

import java.util.List;

public interface ITweetAlg<X, Y> {
	X post(String user, String text);
	X reply(String to, X tweet);
	
	Y timeline(List<X> tweets);
}
