package app;

import gui.ClientView;
import hibernate.classes.views.BikeView;

import java.util.List;

import model.ServiceClient;
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
	
	@SuppressWarnings("unused")
	private void startApplication() {
		clientController.showLoginWindow();
	}
	
	public static void main(String[] args) {
		ServiceClient serviceClient = new ServiceClient();
		List<BikeView> bikes = serviceClient.getBikes();
		
		for (BikeView bikeView : bikes) {
			System.out.println(bikeView);
		}
		
		// SwingUtilities.invokeLater(new Runnable() {
		// @Override
		// public void run() {
		// ClientApplication client = new ClientApplication();
		// client.startApplication();
		// }
		// });
		
	}
}
