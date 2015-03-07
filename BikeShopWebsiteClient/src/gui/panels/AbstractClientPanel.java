package gui.panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public abstract class AbstractClientPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	protected GridBagConstraints gbc;

	public AbstractClientPanel() {
		setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.weighty = 1;
	}

	protected abstract void init();
}
