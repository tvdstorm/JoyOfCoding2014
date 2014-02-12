package tweet.objalg.retweet;

import tweet.objalg.print_and_hashtags.IPrintAndHashtags;

public class Trace extends tweet.objalg.trace.Trace implements IRetweetAlg<IPrintAndHashtags> {

	private IRetweetAlg<IPrintAndHashtags> printAndHashtags;

	public Trace(IRetweetAlg<IPrintAndHashtags> ph) {
		super(ph);
		this.printAndHashtags = ph;
	}
		
	@Override
	public IPrintAndHashtags retweet(IPrintAndHashtags tweet) {
		return trace(printAndHashtags.retweet(tweet));
	}


}
