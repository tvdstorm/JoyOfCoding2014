package tweet.interp.rt_and_htags;

import java.util.ArrayList;
import java.util.List;

import tweet.interp.hashtags.ITweet;
import tweet.interp.hashtags.Tweet;


public class Main {
	public static void main(String[] args) {
		ITweet t = new Retweet(new Tweet("JoyOfCoding", "#Hello #world!"));
		List<String> tags = new ArrayList<>();
		t.hashTags(tags);
		for (String tag: tags) {
			System.out.println(tag);
		}	
	}
}
