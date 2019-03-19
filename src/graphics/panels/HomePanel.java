package graphics.panels;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;

import control.Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePanel extends MyPanel {

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		super();
		
		// Set table
		String[] headers = new String[] {
				"DATE", "SCORE"
		};
		String[][] data = new String[][] {
				{ "test", "test" },
				{ "test", "test" },
				{ "test", "test" }
		};
		JTable table = new JTable(data, headers);
		JScrollPane tableScroll = new JScrollPane(table);
		tableScroll.setVisible(true);
		tableScroll.setBounds(20, 20, 300, 180);
		add(tableScroll);
		
		// Set buttons
		final Controller controller = Controller.getInstance();
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(25, 207, 83, 23);
		add(btnNewGame);
		
		JButton btnScores = new JButton("Scores");
		btnScores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				controller.showScoresPanel();
			}
		});
		btnScores.setBounds(118, 207, 89, 23);
		add(btnScores);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(217, 207, 89, 23);
		add(btnExit);
	}
}
