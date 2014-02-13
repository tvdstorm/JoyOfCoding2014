package tweet.objalg.base;

public class Lift implements ITweetAlg<IBuild> {
	@Override
	public IBuild tweet(final String user, final String text) {
		return new IBuild() {
			@Override
			public <X> X build(ITweetAlg<X> alg) {
				return alg.tweet(user, text);
			}
		};
	}

	@Override
	public IBuild reply(final String to, final IBuild tweet) {
		return new IBuild() {
			@Override
			public <X> X build(ITweetAlg<X> alg) {
				return alg.reply(to, tweet.build(alg));
			}
		};
	}

}
