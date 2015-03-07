package gui.listeners;

import gui.ChildMenuButtonsEnum;
import gui.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ChildMenuButtonActionListener implements ActionListener {
	private MainWindow mainWindow;
	
	public ChildMenuButtonActionListener(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		String text = button.getText().toUpperCase().replace(" ", "_");
		
		ChildMenuButtonsEnum childMenuButtonsEnum = ChildMenuButtonsEnum.valueOf(text);
		
		mainWindow.displayPanel(childMenuButtonsEnum);
	}
}
