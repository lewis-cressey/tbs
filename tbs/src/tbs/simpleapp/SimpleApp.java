package tbs.simpleapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import tbs.gfx.Screen;

public abstract class SimpleApp {
	public final Screen screen;
	private final SimpleScreen simpleScreen;
	
	public SimpleApp() {
		this(400, 400);
	}
	
	public SimpleApp(int width, int height) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Simple graphics window");

		screen = new Screen(width, height);
		simpleScreen = new SimpleScreen(screen);
		frame.getContentPane().add(simpleScreen);

		frame.pack();
		frame.setVisible(true);

		Timer timer = new Timer(20, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				screen.onFrame();
				onFrame();
				simpleScreen.repaint();
			}
		});

		SwingUtilities.invokeLater(new Runnable() {	
			@Override
			public void run() {
				main();
				timer.start();
			}
		});
	}
	
	public void main() {
	}
	
	public void onFrame() {
	}
	
	public void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
		}
	}
}
