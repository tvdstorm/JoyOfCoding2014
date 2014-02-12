package tweet.adt;

import java.util.HashMap;
import java.util.Map;
import static java.util.Collections.singletonMap;

public class AnotherTweets {
	public interface ITweet {}

	private static class Tweet implements ITweet {
		int key;
		Tweet(int k) { key = k; }
	}

	private static int count = 0;
	private static Map<Integer,Map<String,String>> tweets = new HashMap<>();
	private static Map<Integer,Map<Integer,String>> replies = new HashMap<>();
	
	
	public static ITweet tweet(String user, String text) {
		int key = count++;
		tweets.put(key, singletonMap(user, text));
		return new Tweet(key);
	}
	
	public static ITweet reply(String to, ITweet tweet) {
		int key = count++;
		replies.put(key, singletonMap(((Tweet)tweet).key, to));
		return new Tweet(key);
	}
	
	public static String getUser(ITweet tweet) {
		int key = ((Tweet)tweet).key;
		if (tweets.containsKey(key)) {
			return tweets.get(key).keySet().iterator().next();
		}
		if (replies.containsKey(key)) {
			int t = replies.get(key).keySet().iterator().next();
			return getUser(new Tweet(t)); 
		}
		return null;
	}
	
	public static String getText(ITweet tweet) {
		int key = ((Tweet)tweet).key;
		if (tweets.containsKey(key)) {
			return tweets.get(key).values().iterator().next();
		}
		if (replies.containsKey(key)) {
			int t = replies.get(key).keySet().iterator().next();
			return getText(new Tweet(t)); 
		}
		return null;
	}
	
	public static String getTo(ITweet tweet) {
		int key = ((Tweet)tweet).key;
		if (replies.containsKey(key)) {
			return replies.get(key).values().iterator().next();
		}
		return null;
	}
	
	public static String print(ITweet tweet) {
		int key = ((Tweet)tweet).key;
		if (tweets.containsKey(key)) {
			return getText(tweet) + " (" + getUser(tweet) + ")";
		}
		if (replies.containsKey(key)) {
			return "@" + getTo(tweet) + " " + getText(tweet);
		}
		return null;
	}
}
