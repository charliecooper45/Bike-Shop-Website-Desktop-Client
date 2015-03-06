package gui.panels;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public abstract class AbstractTablePanel extends AbstractClientPanel {
	private static final long serialVersionUID = 1L;

	protected JScrollPane tableScroll;
	protected JTable table;

	// TODO: show a hibernate view here

	@Override
	public abstract void init();
}
