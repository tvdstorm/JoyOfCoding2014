package tweet.objalg.retweet;


import java.util.List;

import tweet.objalg.base.IHashtags;
import tweet.objalg.base.IPrint;
import tweet.objalg.print_and_hashtags.IPrintAndHashtags;

public class PrintAndHashtags extends tweet.objalg.print_and_hashtags.PrintAndHashtags implements IRetweetAlg<IPrintAndHashtags> {
	private IRetweetAlg<IPrint> print;
	private IRetweetAlg<IHashtags> hashtags;

	public PrintAndHashtags(IRetweetAlg<IPrint> print, IRetweetAlg<IHashtags> hashtags) {
		super(print, hashtags);
		this.print = print;
		this.hashtags = hashtags;
	}

	@Override
	public IPrintAndHashtags retweet(IPrintAndHashtags tweet) {
		final IPrint p = print.retweet(tweet);
		final IHashtags h = hashtags.retweet(tweet);
		return new IPrintAndHashtags() {
			@Override
			public void hashtags(List<String> tags) {
				h.hashtags(tags);
			}
			
			@Override
			public String print() {
				return p.print();
			}
		};
	}
	
	
}
