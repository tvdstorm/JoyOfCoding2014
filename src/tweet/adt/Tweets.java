package tweet.adt;

public class Tweets {
	public interface ITweet {}

	static class Post implements ITweet {
		String user, text;
		Post(String user, String text) { 
			this.user = user; 
			this.text = text; 
		}
	}
	
	static class Reply implements ITweet {
		String to; 
		ITweet tweet;
		Reply(String to, ITweet tweet) { 
			this.to = to; 
			this.tweet = tweet; 
		}
	}
	
	public static ITweet tweet(String user, String text) {
		return new Post(user, text);
	}
	
	public static ITweet reply(String to, ITweet tweet) {
		return new Reply(to, tweet);
	}

	
	public static String print(ITweet tweet) {
		if (tweet instanceof Post) {
			return getText(tweet) + " (" + getUser(tweet) + ")";
		}
		if (tweet instanceof Reply) {
			return "@" + getTo(tweet) + " " + getText(tweet);
		}
		return null;
	}

	
	public static String getUser(ITweet tweet) {
		if (tweet instanceof Post) {
			return ((Post)tweet).user;
		}
		if (tweet instanceof Reply) {
			return getUser(((Reply)tweet).tweet);
		}
		return null;
	}
	
	public static String getText(ITweet tweet) {
		if (tweet instanceof Post) {
			return ((Post)tweet).text;
		}
		if (tweet instanceof Reply) {
			return getText(((Reply)tweet).tweet);
		}
		return null;
	}
	
	public static String getTo(ITweet tweet) {
		if (tweet instanceof Reply) {
			return ((Reply)tweet).to;
		}
		return null;
	}
}
