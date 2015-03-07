package gui.panels;

import gui.Utils;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;

public class ButtonsPanel extends AbstractClientPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton saveButton;
	private JButton cancelButton;

	public ButtonsPanel() {
		init();
	}
	
	@Override
	protected void init() {
		gbc.anchor = GridBagConstraints.LAST_LINE_START;
		gbc.insets = new Insets(20, 10, 20, 10);
		
		saveButton = new JButton("Save changes");
		Utils.setGBC(gbc, 1, 1, 1, 1, GridBagConstraints.BOTH);
		add(saveButton, gbc);
		
		cancelButton = new JButton("Cancel changes");
		Utils.setGBC(gbc, 1, 2, 1, 1, GridBagConstraints.BOTH);
		add(cancelButton, gbc);
	}
}
