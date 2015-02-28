package gui.panels;

import gui.Utils;
import gui.listeners.ParentMenuButtonActionListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		gbc.weighty = 0;
		gbc.insets = new Insets(10, 0, 10, 0);
		add(label, gbc);
		
		gbc.insets = new Insets(0, 0, 0, 0);
		menuButtons = new JButton[12];
		ParentMenuButtonActionListener parentActionListener = new ParentMenuButtonActionListener();
		MenuPanelButton brandsButton = new MenuPanelButton("Brands", null);
		brandsButton.addActionListener(parentActionListener);
		menuButtons[0] = brandsButton;
		menuButtons[1] = new MenuPanelButton("Add Brand", brandsButton);
		menuButtons[2] = new MenuPanelButton("Remove Brand", brandsButton);
		
		MenuPanelButton bikesButton = new MenuPanelButton("Bikes", null);
		bikesButton.addActionListener(parentActionListener);
		menuButtons[3] = bikesButton;
		menuButtons[4] = new MenuPanelButton("Add Bike", bikesButton);
		menuButtons[5] = new MenuPanelButton("Remove Bike", bikesButton);
		
		MenuPanelButton bikeModelsButton = new MenuPanelButton("Bike Models", null);
		bikeModelsButton.addActionListener(parentActionListener);
		menuButtons[6] = bikeModelsButton;
		menuButtons[7] = new MenuPanelButton("Add Bike Model", bikeModelsButton);
		menuButtons[8] = new MenuPanelButton("Remove Bike Model", bikeModelsButton);
		
		MenuPanelButton administratorButton = new MenuPanelButton("Administrators", null);
		administratorButton.addActionListener(parentActionListener);
		menuButtons[9] = administratorButton;
		menuButtons[10] = new MenuPanelButton("Add Administrator", administratorButton);
		menuButtons[11] = new MenuPanelButton("Remove Administrator", administratorButton);
		
		for(int i = 0; i < menuButtons.length; i++) {
			gbc.anchor = GridBagConstraints.FIRST_LINE_START;
			Utils.setGBC(gbc, i + 2, 1, 1, 1, GridBagConstraints.BOTH);
			
			add(menuButtons[i], gbc);
		}
		
		// fill remaining space
		Utils.setGBC(gbc, menuButtons.length + 2, 1, 1, 1, 1);
		gbc.weighty = 1;
		add(new JPanel(), gbc);
	}
}
