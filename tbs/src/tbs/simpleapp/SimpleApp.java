package tbs.simpleapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public abstract class SimpleApp {
	public final SimpleScreen screen;
	
	public SimpleApp() {
		this(400, 400);
	}
	
	public SimpleApp(int width, int height) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Simple graphics window");

		screen = new SimpleScreen(width, height);
		frame.getContentPane().add(screen);

		frame.pack();
		frame.setVisible(true);

		main();
		
		Timer timer = new Timer(20, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onFrame();
				screen.repaint();
			}
		});
		timer.start();
	}
	
	public void main() {
		
	}
	
	public void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
		}
	}
	
	public void onFrame() {
		
	}
}
