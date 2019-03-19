package graphics.panels;
import javax.swing.JButton;

import control.Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoresPanel extends MyPanel {

	/**
	 * Create the panel.
	 */
	public ScoresPanel() {
		
		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Controller.getInstance().showHomePanel();
			}
		});
		button.setBounds(10, 10, 50, 30);
		add(button);
	}
}