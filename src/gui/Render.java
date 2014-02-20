package gui;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Render implements IGUIAlg<IRender> {

	@Override
	public IRender label(final String txt) {
		return new IRender() {
			
			@Override
			public void render(JPanel panel) {
				panel.add(new JLabel(txt));
			}
		};
	}

	@Override
	public IRender button(final String label) {
		return new IRender() {
			
			@Override
			public void render(JPanel panel) {
				panel.add(new JButton(label));
			}
		};
	}

	@Override
	public IRender group(final List<IRender> components) {
		return new IRender() {
			@Override
			public void render(JPanel panel) {
				JPanel group = new JPanel();
				for (IRender r: components) {
					r.render(group);
				}
				panel.add(group);
			}
		};
	}

}
