package gui.panels;

import gui.Utils;

import java.awt.GridBagConstraints;

public abstract class AbstractMainPanel extends AbstractClientPanel{
	private static final long serialVersionUID = 1L;
	
	protected AbstractClientPanel tablePanel;
	protected AbstractClientPanel buttonsPanel;
	
	@Override
	protected void init() {
		buttonsPanel = new ButtonsPanel();
		gbc.weighty = 1;
		Utils.setGBC(gbc, 2, 1, 1, 1, GridBagConstraints.BOTH);
		add(buttonsPanel, gbc);
	}
}
