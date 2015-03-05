package gui.panels;

import java.awt.BorderLayout;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


public class TablePanel extends AbstractClientPanel {
	private static final long serialVersionUID = 1L;
	
	private JTable table;
	//TODO: show a hibernate view here

	@Override
	protected void init() {
		setLayout(new BorderLayout());
		
		table = new JTable(new AbstractTableModel() {
			private static final long serialVersionUID = 1L;

			@Override
			public Object getValueAt(int arg0, int arg1) {
				return "test";
			}
			
			@Override
			public int getRowCount() {
				return 10;
			}
			
			@Override
			public int getColumnCount() {
				return 5;
			}
		});
		
		add(table, BorderLayout.CENTER);
	}
}
