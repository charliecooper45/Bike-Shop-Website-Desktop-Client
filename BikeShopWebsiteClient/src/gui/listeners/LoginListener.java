package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.ClientController;

public class LoginListener extends AbstractClientListener implements ActionListener {
	public LoginListener(ClientController controller) {
		super(controller);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		controller.showMainWindow();
	}
}
