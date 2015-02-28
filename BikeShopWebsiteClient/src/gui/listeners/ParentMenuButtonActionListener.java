package gui.listeners;

import gui.panels.MenuPanelButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParentMenuButtonActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		MenuPanelButton button = (MenuPanelButton) event.getSource();
		button.showOrHideChildButtons();
	}

}
