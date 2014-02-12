package tweet.adt;

import static tweet.adt.Tweets.*;
import static tweet.adt.Check.*;

public class Main {
	public static void main(String[] args) {
		ITweet t = tweet("JoyOfCoding", "#Hello #world!");
		System.out.println(print(t));
		System.out.println(check(t));
	}
}
