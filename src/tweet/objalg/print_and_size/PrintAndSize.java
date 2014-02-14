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
	
	private IPrintAndSize combine(final IPrint p, final ISize s) {
		return new IPrintAndSize() {
			public int size() { return s.size(); }
			public String print() { return p.print(); }
		};
	}
	
	public IPrintAndSize post(String u, String t) {
		return combine(print.post(u, t), size.post(u, t));
	}

	public IPrintAndSize reply(String to, IPrintAndSize tw) {
		return combine(print.reply(to,  tw), size.reply(to, tw));
	}
}
