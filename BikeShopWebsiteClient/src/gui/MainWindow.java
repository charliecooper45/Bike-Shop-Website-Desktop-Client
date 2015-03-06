package gui;

import gui.panels.BikesMainPanel;
import gui.panels.MenuPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends AbstractClientWindow {
	private static final long serialVersionUID = 1L;
	
	// panels
	private JPanel menuPanel;
	private JPanel bikesMainPanel;
	
	@Override
	protected void init() {
		setTitle("BikeShopWebsite Client");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(1000, 500));
		
		setLayout(new BorderLayout());
		
		menuPanel = new MenuPanel();
		add(menuPanel, BorderLayout.WEST);
		
		bikesMainPanel = new BikesMainPanel();
	}
}
