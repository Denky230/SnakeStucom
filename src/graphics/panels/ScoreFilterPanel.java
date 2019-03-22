package graphics.panels;

import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ScoreFilterPanel extends MyPanel {

	/**
	 * Create the panel.
	 */
	public ScoreFilterPanel() {
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(10, 11, 189, 20);
		add(spinner);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(207, 10, 84, 23);
		add(btnSearch);
		
		// Set table
		String[] headers = new String[] {
				"USER", "SCORE"
		};
		String[][] data = new String[][] {
				{ "test", "test" }, { "test", "test" },
				{ "test", "test" }, { "test", "test" },
				{ "test", "test" }, { "test", "test" },
				{ "test", "test" }, { "test", "test" }
		};
		JTable table = new JTable(data, headers);
		table.setEnabled(false);
		JScrollPane tableScroll = new JScrollPane(table);
		tableScroll.setVisible(true);
		tableScroll.setBounds(10, 40, 281, 130);
		add(tableScroll);
	}
}