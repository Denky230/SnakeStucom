package control;

import graphics.MySplitPane;
import graphics.panels.HomePanel;
import graphics.panels.LoginPanel;
import graphics.panels.MyPanel;
import graphics.panels.ScoresPanel;

public class Controller {

	private final MySplitPane main;
	
	private Controller() {
		this.main = new MySplitPane();;
	}
	public static Controller instance;
	public static Controller getInstance() {
		if (instance == null)
			instance = new Controller();
		return instance;
	}
	
	public void showLoginPanel() {
		main.setRightPanel(new LoginPanel());
	}
	public void showHomePanel() {
		main.setRightPanel(new HomePanel());
	}
	public void showScoresPanel() {
		main.setRightPanel(new ScoresPanel());
	}
	
	public MySplitPane getMainPanel() {
		return this.main;
	}
}