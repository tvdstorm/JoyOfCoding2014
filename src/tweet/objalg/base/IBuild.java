package tweet.objalg.base;

public interface IBuild {
	<X> X build(ITweetAlg<X> alg);
}
