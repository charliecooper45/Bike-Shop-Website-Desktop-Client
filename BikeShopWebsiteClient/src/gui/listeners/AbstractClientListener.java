package gui.listeners;

import controller.ClientController;

public abstract class AbstractClientListener {
	protected final ClientController controller;

	public AbstractClientListener(ClientController controller) {
		this.controller = controller;
	}
}
