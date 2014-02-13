package tweet.objalg.base;

public class Print implements ITweetAlg<IPrint> {
	public IPrint post(final String user, final String text) {
		return new IPrint() {
			public String print() { 
				return text + " (" + user + ")"; 
			}
		};
	}

	public IPrint reply(final String to, final IPrint tweet) {
		return new IPrint() {
			public String print() { 
				return "@" + to + " " + tweet.print(); 
			}
		};
	}
}
