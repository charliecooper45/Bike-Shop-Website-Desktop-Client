package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public abstract class AbstractClientWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	protected GridBagConstraints gbc;

	public AbstractClientWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.weighty = 1;
		init();
	}

	protected abstract void init();
}
