package gui;

import java.util.List;

public interface IGUIAlg<X> {
	X label(String txt);
	X button(String label);
	X group(List<X> components);
}
