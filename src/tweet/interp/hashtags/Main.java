package tweet.interp.hashtags;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ITweet t = new Tweet("JoyOfCoding", "#Hello #world!");
		List<String> tags = new ArrayList<>();
		t.hashTags(tags);
		for (String tag: tags) {
			System.out.println(tag);
		}
	}
	
}
