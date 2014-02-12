package tweet.interp.base;

public interface IFactory {
	ITweet tweet(String user, String text);
	ITweet reply(String to, ITweet tweet);
}
