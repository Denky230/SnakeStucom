package graphics.panels;

import javax.swing.JButton;
import javax.swing.JTextField;

import control.Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPanel extends MyPanel {
	
	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		super();
		
		JTextField inUsername = new JTextField();
		inUsername.setBounds(80, 100, 166, 20);
		add(inUsername);

		JTextField inPassword = new JTextField();
		inPassword.setBounds(80, 125, 166, 20);
		add(inPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(125, 155, 82, 23);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				// Show Home Menu
				Controller.getInstance().showHomePanel();
			}
		});
		
		add(btnLogin);
	}
}