package tweet.objalg.print_and_hashtags;

import java.util.List;

import tweet.objalg.base.IHashtags;
import tweet.objalg.base.IPrint;
import tweet.objalg.base.ITweetAlg;

public class PrintAndHashtags implements ITweetAlg<IPrintAndHashtags> {
	private ITweetAlg<IPrint> print;
	private ITweetAlg<IHashtags> hashtags;

	public PrintAndHashtags(ITweetAlg<IPrint> print, ITweetAlg<IHashtags> hashtags) {
		this.print = print;
		this.hashtags = hashtags;
	}
	
	@Override
	public IPrintAndHashtags tweet(String user, String text) {
		final IPrint p = print.tweet(user,  text);
		final IHashtags h = hashtags.tweet(user,  text);
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

	@Override
	public IPrintAndHashtags reply(String to, IPrintAndHashtags tweet) {
		final IPrint p = print.reply(to,  tweet);
		final IHashtags h = hashtags.reply(to, tweet);
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
