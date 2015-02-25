package app;

import gui.ClientView;

import javax.swing.SwingUtilities;

import controller.ClientController;

/**
 * Contains the main method for the client application
 * @author Charlie
 */
public class ClientApplication {
	private ClientController clientController;
	private ClientView view;
	
	public ClientApplication() {
		view = new ClientView();
		clientController = new ClientController(view);
	}
	
	private void startApplication() {
		clientController.showLoginWindow();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ClientApplication client = new ClientApplication();
				client.startApplication();
			}
		});
	}
}
