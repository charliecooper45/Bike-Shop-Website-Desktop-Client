package gui;

import gui.listeners.LoginListener;

public class ClientView {
	private LoginWindow loginWindow;
	private MainWindow mainWindow;
	
	public ClientView() {
		loginWindow = new LoginWindow();
		mainWindow = new MainWindow();
	}

	// --------------------------------------- show interfaces -------------------------------------
	public void showLoginWindow() {
		loginWindow.setVisible(true);
	}
	
	public void showMainWindow() {
		loginWindow.setVisible(false);
		mainWindow.setVisible(true);
	}

	// --------------------------------------- set listeners ---------------------------------------
	public void setLoginListener(LoginListener loginListener) {
		loginWindow.setLoginListener(loginListener);
	}
}
