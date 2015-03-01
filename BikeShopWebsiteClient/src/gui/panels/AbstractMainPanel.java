package gui.panels;

import java.awt.GridBagConstraints;

import gui.Utils;

public abstract class AbstractMainPanel extends AbstractClientPanel{
	private static final long serialVersionUID = 1L;
	
	private AbstractClientPanel tablePanel;
	private AbstractClientPanel buttonsPanel;
	
	@Override
	protected void init() {
		tablePanel = new TablePanel();
		gbc.weighty = 3;
		Utils.setGBC(gbc, 1, 1, 1, 1, GridBagConstraints.BOTH);
		add(tablePanel, gbc);
		
		buttonsPanel = new ButtonsPanel();
		gbc.weighty = 1;
		Utils.setGBC(gbc, 2, 1, 1, 1, GridBagConstraints.BOTH);
		add(buttonsPanel, gbc);
	}
}
