package tweet.objalg.print_and_size;

import tweet.objalg.base.IPrint;
import tweet.objalg.base.ISize;
import tweet.objalg.base.ITweetAlg;

public class PrintAndSize implements ITweetAlg<IPrintAndSize> {
	private ITweetAlg<IPrint> print;
	private ITweetAlg<ISize> size;

	public PrintAndSize(ITweetAlg<IPrint> print, ITweetAlg<ISize> size) {
		this.print = print;
		this.size = size;
	}
	
	@Override
	public IPrintAndSize post(String user, String text) {
		final IPrint p = print.post(user,  text);
		final ISize s = size.post(user,  text);
		return new IPrintAndSize() {
			@Override
			public int size() { return s.size(); }
			
			@Override
			public String print() { return p.print(); }
		};
	}

	@Override
	public IPrintAndSize reply(String to, IPrintAndSize tweet) {
		final IPrint p = print.reply(to,  tweet);
		final ISize s = size.reply(to, tweet);
		return new IPrintAndSize() {
			@Override
			public int size() { return s.size(); }
			
			@Override
			public String print() { return p.print(); }
		};
	}

}
