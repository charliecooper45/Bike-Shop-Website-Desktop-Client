package gui.panels;

import gui.Utils;

import java.awt.GridBagConstraints;

public class BikesMainPanel extends AbstractMainPanel {
	private static final long serialVersionUID = 1L;

	public BikesMainPanel() {
		init();
	}
	
	@Override
	protected void init() {
		tablePanel = new BikesTablePanel();
		gbc.weighty = 10;
		Utils.setGBC(gbc, 1, 1, 1, 1, GridBagConstraints.BOTH);
		add(tablePanel, gbc);
		
		super.init();
	}
}
