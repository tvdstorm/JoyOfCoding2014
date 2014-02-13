package tweet.objalg.base;

public class Size implements ITweetAlg<ISize> {
	public ISize post(String user, final String text) {
		return new ISize() {
			public int size() {
				return text.length();
			}
		};
	}

	@Override
	public ISize reply(final String to, final ISize tweet) {
		return new ISize() {
			public int size() {
				return 1 + to.length() + tweet.size();
			}
		};
	}
}
