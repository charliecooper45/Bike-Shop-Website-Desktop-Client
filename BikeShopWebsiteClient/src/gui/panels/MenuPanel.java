package gui.panels;

import gui.Utils;
import gui.listeners.ChildMenuButtonActionListener;
import gui.listeners.ParentMenuButtonActionListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;

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
		
		//TODO: add listener for these button, gui listeners stay in gui package, anything that communicates with the models should go in the controller package
		gbc.insets = new Insets(0, 0, 0, 0);
		menuButtons = new JButton[7];
		
		MenuPanelButton tablesButton = new MenuPanelButton("Brands", null);
		menuButtons[0] = tablesButton;
		menuButtons[1] = new MenuPanelButton("Bike Models", tablesButton);
		menuButtons[2] = new MenuPanelButton("Bikes", tablesButton);
		menuButtons[3] = new MenuPanelButton("Brands", tablesButton);
		
		MenuPanelButton usersButton = new MenuPanelButton("Users", null);
		menuButtons[4] = usersButton;
		menuButtons[5] = new MenuPanelButton("Standard Users", usersButton);
		menuButtons[6] = new MenuPanelButton("Administrators", usersButton);
		
		ActionListener parentActionListener = new ParentMenuButtonActionListener();
		ActionListener childActionListener = new ChildMenuButtonActionListener();
		for(int i = 0; i < menuButtons.length; i++) {
			if(i % 4 == 0) {
				// parent button
				menuButtons[i].addActionListener(parentActionListener);
			} else {
				// child button
				menuButtons[i].addActionListener(childActionListener);
			}
			
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
