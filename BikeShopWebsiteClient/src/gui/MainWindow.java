package gui;

import gui.panels.AbstractMainPanel;
import gui.panels.BikesMainPanel;
import gui.panels.MenuPanel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends AbstractClientWindow {
	private static final long serialVersionUID = 1L;
	
	// panels
	private JPanel menuPanel;
	private JPanel bikesMainPanel;
	
	private BorderLayout layout;
	
	@Override
	protected void init() {
		setTitle("BikeShopWebsite Client");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(1000, 500));
		
		layout = new BorderLayout();
		setLayout(layout);
		
		menuPanel = new MenuPanel(this);
		add(menuPanel, BorderLayout.WEST);
		
		bikesMainPanel = new BikesMainPanel();
	}
	
	public void displayPanel(ChildMenuButtonsEnum buttonsEnum) {
		// remove the component currently at the centre if there is one
		System.out.println(layout.getClass());
		Component centreComponent = layout.getLayoutComponent(BorderLayout.CENTER);
		if(centreComponent instanceof AbstractMainPanel) {
			System.out.println("Removing component...");
			remove(centreComponent);
		}
		
		// add the new component
		switch (buttonsEnum) {
		case ADMINISTRATORS:
			break;
		case BIKES:
			add(bikesMainPanel, BorderLayout.CENTER);
			break;
		case BIKE_MODELS:
			break;
		case BRANDS:
			break;
		case STANDARD_USERS:
			break;
		}
		
		validate();
		repaint();
	}
}
