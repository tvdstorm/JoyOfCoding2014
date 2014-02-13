package tweet.interp.size;

public class Main {

	public static void main(String[] args) {
		ITweet t = new Post("JoyOfCoding", "#Hello #world!");
		System.out.println(t.size());
	}
	
}
