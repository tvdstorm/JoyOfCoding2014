package tweet.objalg.base;

public class Print implements ITweetAlg<IPrint> {
	@Override
	public IPrint tweet(final String user, final String text) {
		return new IPrint() {
			@Override
			public String print() { return text + " (" + user + ")"; }
		};
	}

	@Override
	public IPrint reply(final String to, final IPrint tweet) {
		return new IPrint() {
			@Override
			public String print() { return "@" + to + " " + tweet.print(); }
		};
	}
}
