package gui;

import java.awt.GridBagConstraints;

public class Utils {
	public static void setGBC(GridBagConstraints gc, int row, int column, int width, int height, int fill) {
		gc.gridy = row;
		gc.gridx = column;
		gc.gridwidth = width;
		gc.gridheight = height;
		gc.fill = fill;
	} 
}
