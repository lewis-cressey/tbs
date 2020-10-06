package tbs.simpleapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SimpleScreen extends JPanel {
	private final int width;
	private final int height;
	private BufferedImage image;
	private final Graphics2D graphics;
	private int rgb;
	
	SimpleScreen(int width, int height) {
		this.width = width;
		this.height = height;
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		graphics = (Graphics2D)image.createGraphics();
		setPreferredSize(new Dimension(width, height));
	}
	
	public Graphics2D createGraphics() {
		return (Graphics2D)image.createGraphics();
	}
	
	public void setColour(int rgb) {
		this.rgb = rgb;
		graphics.setColor(new Color(rgb));		
	}
	
	public void clear() {
		graphics.fillRect(0, 0, width, height);
	}
	
	public void fill(int x, int y, int width, int height) {
		graphics.fillRect(x, y, width, height);
	}

	public void plot(int x, int y) {
		image.setRGB(x, y, rgb);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}
}
