package graphics.panels;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TopScorePanel extends MyPanel {

	/**
	 * Create the panel.
	 */
	public TopScorePanel() {
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(65, 62, 46, 27);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Score:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(65, 91, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(65, 114, 46, 14);
		add(lblNewLabel_2);

	}
}