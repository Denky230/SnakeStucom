package graphics.panels;

import javax.swing.JButton;

import control.Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class ScoresPanel extends MyPanel {

	/**
	 * Create the panel.
	 */
	public ScoresPanel() {
		
		// Back button
		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controller.getInstance().showHomePanel();
			}
		});
		button.setBounds(10, 10, 41, 23);
		add(button);
		
		// Tab panel
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 44, 305, 203);
		add(tabbedPane);
		
		tabbedPane.addTab("User List", new UserListPanel());
		tabbedPane.addTab("Best User Score", new TopScorePanel());
		tabbedPane.addTab("Score Filter", new ScoreFilterPanel());
	}
}