package gui;

import java.util.List;

public class ToString implements IGUIAlg<String> {

	@Override
	public String label(String txt) {
		return "label(" + txt + ")";
	}

	@Override
	public String button(String label) {
		return "button(" + label + ")";
	}

	@Override
	public String group(List<String> components) {
		return "group(" + components + ")";
	}

}
