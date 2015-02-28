package gui.panels;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class MenuPanelButton extends JButton {
	private static final long serialVersionUID = 1L;
	
	private List<MenuPanelButton> childButtons;
	
	public MenuPanelButton(String text, MenuPanelButton parentButton) {
		setText(text);
		
		if(parentButton != null) {
			setVisible(false);
			setBackground(Color.GRAY);
			
			parentButton.addChildButton(this);
		} else {
			childButtons = new ArrayList<>(2);
		}
	}
	
	public void addChildButton(MenuPanelButton childButton) {
		childButtons.add(childButton);
	}
	
	public void showOrHideChildButtons() {
		for (MenuPanelButton childButton : childButtons) {
			childButton.setVisible(!childButton.isVisible());
		}
	}
}
