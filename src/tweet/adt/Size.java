package tweet.adt;

public class Size extends Tweets {
	public static int size(ITweet tweet) {
		if (tweet instanceof Tweet) {
			return getText(tweet).length();
		}
		if (tweet instanceof Reply) {
			return 1 + getTo(tweet).length() + 1 + getText(tweet).length();
		}
		return -1;
	}
}
