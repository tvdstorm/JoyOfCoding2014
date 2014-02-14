package tweet.objalg.base;

public class ToString implements ITweetAlg<String> {
	public String post(String user, String text) {
		return text + " (" + user + ")"; 
	}

	public String reply(String to, String tweet) {
		return "@" + to + " " + tweet;
	}
}
