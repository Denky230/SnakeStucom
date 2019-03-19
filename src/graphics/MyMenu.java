package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MyMenu extends JMenu implements ActionListener {

	public MyMenu(String name) {
		super(name);
		
		// Menu items
		JMenuItem[] menuItems = new JMenuItem[] {
				new JMenuItem("Item_01"),
				new JMenuItem("Item_02")
		};
		for (int i = 0; i < menuItems.length; i++) {
			// Add item to menu
			add(menuItems[i]);			
			// Add click listener
			menuItems[i].addActionListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
