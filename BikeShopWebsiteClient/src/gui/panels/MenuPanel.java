package gui.panels;

import gui.Utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MenuPanel extends AbstractClientPanel {
	private static final long serialVersionUID = 1L;

	// menu buttons
	private JButton[] menuButtons;

	@Override
	protected void init() {
		setPreferredSize(new Dimension(250, 400));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel label = new JLabel("Please select an option below:");
		Utils.setGBC(gbc, 1, 1, 1, 1, GridBagConstraints.NONE);
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.weighty = 1;
		gbc.insets = new Insets(10, 0, 10, 0);
		add(label, gbc);
		
		gbc.insets = new Insets(0, 0, 0, 0);
		menuButtons = new JButton[4];
		menuButtons[0] = new MenuPanelButton("Brands");
		menuButtons[1] = new MenuPanelButton("Bikes");
		menuButtons[2] = new MenuPanelButton("Bike Models");
		menuButtons[3] = new MenuPanelButton("Administrators");


		for(int i = 0; i < menuButtons.length; i++) {
			gbc.anchor = GridBagConstraints.FIRST_LINE_START;
			Utils.setGBC(gbc, i + 2, 1, 1, 1, GridBagConstraints.BOTH);
			
			if(i == menuButtons.length - 1) {
				// last menu button
				gbc.fill = GridBagConstraints.HORIZONTAL;
				gbc.weighty = 10000;
			}
			
			add(menuButtons[i], gbc);
		}
	}
}
