package tweet.interp.base;

public interface IFactory {
	ITweet post(String user, String text);
	ITweet reply(String to, ITweet tweet);
}
