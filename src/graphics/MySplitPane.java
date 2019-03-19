package graphics;

import javax.swing.JSplitPane;

import graphics.panels.LoginPanel;

import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Rectangle;

public class MySplitPane extends JSplitPane {

	private final int DIVIDER_LOCATION = 120;
	
	/**
	 * Create the panel.
	 */
	public MySplitPane() {
		setDividerLocation(DIVIDER_LOCATION);
		setEnabled(false);
		
		/* LEFT PANEL */
		JScrollPane scrollPane = new JScrollPane();
		setLeftComponent(scrollPane);
		// Build menu structure
		JMenuBar menuBar = new JMenuBar();
		scrollPane.setColumnHeaderView(menuBar);
		MyMenu menu = new MyMenu("Menu");
		menuBar.add(menu);
		
		/* RIGHT PANEL */
		// Set initial right panel
		LoginPanel panel = new LoginPanel();
		setRightComponent(panel);
	}
	
	public void setRightPanel(JPanel panel) {
		setRightComponent(panel);
		setDividerLocation(DIVIDER_LOCATION);
	}
}