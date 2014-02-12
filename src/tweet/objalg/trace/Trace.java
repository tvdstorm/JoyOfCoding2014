package tweet.objalg.trace;

import java.util.List;

import tweet.objalg.base.ITweetAlg;
import tweet.objalg.print_and_hashtags.IPrintAndHashtags;

public class Trace implements ITweetAlg<IPrintAndHashtags> {

	private ITweetAlg<IPrintAndHashtags> printAndHashtags;

	public Trace(ITweetAlg<IPrintAndHashtags> ph) {
		this.printAndHashtags = ph;
	}
	
	protected static IPrintAndHashtags trace(final IPrintAndHashtags ph) {
		return new IPrintAndHashtags() {
			@Override
			public void hashtags(List<String> tags) {
				System.out.println("LOG: Collecting hash tags for tweet:" + ph.print());
				ph.hashtags(tags);
			}
			
			@Override
			public String print() {
				System.out.println("LOG: printing " + ph.print());
				return ph.print();
			}
		};
	}
	
	@Override
	public IPrintAndHashtags tweet(String user, String text) {
		return trace(printAndHashtags.tweet(user, text));
	}

	@Override
	public IPrintAndHashtags reply(String to, IPrintAndHashtags tweet) {
		return trace(printAndHashtags.reply(to, tweet));
	}
	

}
