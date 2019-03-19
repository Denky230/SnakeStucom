package main;

import java.awt.EventQueue;

import graphics.MainFrame;

public class SnakeTucom {
    
    public static void main(String[] args) {

    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}