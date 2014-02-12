package tweet.adt;
import static tweet.adt.AnotherTweets.*;

public class AnotherMain {
	public static void main(String[] args) {
		ITweet t = tweet("JoyOfCoding", "#Hello #world!");
		System.out.println(print(t));
	}
}
