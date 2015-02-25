package controller;

import gui.ClientView;
import gui.listeners.LoginListener;

public class ClientController {
	private ClientView view;
	
	public ClientController(ClientView view) {
		this.view = view;
		
		setListeners();
	}
	
	public void showLoginWindow() {
		view.showLoginWindow();
	}

	public void showMainWindow() {
		view.showMainWindow();
	}
	
	private void setListeners() {
		LoginListener loginListener = new LoginListener(this);
		view.setLoginListener(loginListener);
	}

}
