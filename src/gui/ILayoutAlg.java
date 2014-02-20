package gui;

import java.util.List;

public interface ILayoutAlg<X> extends IGUIAlg<X> {
	X horizontal(List<X> components);
	X vertical(List<X> components);
}
