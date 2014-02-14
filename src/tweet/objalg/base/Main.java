package tweet.objalg.base;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static <X> X makeTweet(ITweetAlg<X> alg) {
		return alg.post("JoyOfCoding", "#Hello #world!");
	}
	
	static void print() {
		ITweetAlg<IPrint> alg = new Print();
		IPrint printable = alg.post("tvdstorm", "Hello @JoyOfCoding!");
		System.out.println(printable.print());
	}
	
	static void printAndSize() {
		ITweetAlg<IPrint> alg1 = new Print();
		IPrint printable = alg1.post("tvdstorm", "Hello @JoyOfCoding!");
		printable.print();
		
		ITweetAlg<ISize> alg2 = new Size();
		ISize sizable = alg2.post("tvdstorm", "Hello @JoyOfCoding!");
		sizable.size();
	}
	
	static void size() {
		System.out.println(makeTweet(new Size()).size());
	}
	
	static void lift() {
		IBuild t = makeTweet(new Lift());
		System.out.println(t.build(new Print()).print());
		System.out.println(t.build(new Size()).size());
	}
	
	static void hashTags() {
		IHashtags t = makeTweet(new Hashtags());
		List<String> tags = new ArrayList<>();
		t.hashtags(tags);
		for (String tag: tags) {
			System.out.println(tag);
		}
	}
	
	public static void main(String[] args) {
		print();
		size();
		hashTags();
		lift();
	}
}
