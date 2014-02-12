package tweet.adt;


public class Check extends Tweets {
	public static boolean check(ITweet tweet) {
		if (tweet instanceof Tweet) {
			return getText(tweet).length() <= 140;
		}
		if (tweet instanceof Reply) {
			return 1 + getTo(tweet).length() + 1 + 
					getText(tweet).length() <= 140;
		}
		return false;
	}
}
