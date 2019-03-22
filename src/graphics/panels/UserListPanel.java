package graphics.panels;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class UserListPanel extends MyPanel {
	
	/* TEST */
	private String[] users = new String[] {
			"test", "test", "test", "test",
			"test", "test", "test", "test",
			"test", "test", "test", "test"
	};

	/**
	 * Create the panel.
	 */
	public UserListPanel() {
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(10, 38, 280, 131);
		splitPane.setDividerLocation(100);
		splitPane.setEnabled(false);
		add(splitPane);
		
		// User list
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		JList list = new JList(users);
		scrollPane.setViewportView(list);
		
		// Search bar
		JLabel lblFind = new JLabel("Find:");
		lblFind.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFind.setBounds(10, 10, 52, 23);
		add(lblFind);

		JTextField textField = new JTextField();
		textField.setBounds(46, 10, 193, 23);
		textField.setColumns(10);
		add(textField);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(246, 10, 43, 23);
		add(btnNewButton);
	}
}