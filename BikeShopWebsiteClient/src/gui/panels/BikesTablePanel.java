package gui.panels;

import gui.Utils;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class BikesTablePanel extends AbstractTablePanel {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		table = new JTable(new AbstractTableModel() {
			private static final long serialVersionUID = 1L;

			//TODO: this will change according to the view
			private String[] columns = {"Serial Number", "Basket ID", "Bike Model", "Order ID"};

			@Override
			public Object getValueAt(int row, int column) {
				return "test";
			}

			@Override
			public int getRowCount() {
				return 10;
			}

			@Override
			public int getColumnCount() {
				return 4;
			}
			
			@Override
			public String getColumnName(int column) {
				 return columns[column];
			}
			
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return true;
			}
		});
		tableScroll = new JScrollPane(table);
		tableScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		tableScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		gbc.insets = new Insets(40, 40, 40, 40);
		Utils.setGBC(gbc, 1, 1, 1, 1, GridBagConstraints.BOTH);
		add(tableScroll, gbc);
	}
}
