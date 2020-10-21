package tbs.gfx;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Layer implements Comparable<Layer> {
	private final int width;
	private final int height;
	private final int depth;
	private BufferedImage image;
	private final AffineTransform affineTransform;
	private final Graphics2D graphics;
	private int rgb = 0xffffff;

	public Layer(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		int mode = depth != 0 ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
		image = new BufferedImage(width, height, mode);
		affineTransform = new AffineTransform();
		affineTransform.translate(width / 2.0, height / 2.0);
		affineTransform.scale(1, -1);
		graphics = image.createGraphics();
	}
	
	public Graphics2D createGraphics() {
		Graphics2D g = image.createGraphics();
		g.setTransform(affineTransform);
		return g;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public void clear() {
		graphics.setComposite(AlphaComposite.Clear);
		graphics.fillRect(0, 0, width, height);
		graphics.setComposite(AlphaComposite.SrcOver);
	}
	
	public void fill() {
		graphics.fillRect(0, 0, width, height);
	}
	
	public void setColour(int rgb) {
		this.rgb = rgb | 0xff000000;
		graphics.setColor(new Color(this.rgb));		
	}
	
	public void plot(int x, int y) {
		if (x >= 0 && y >= 0 && x < width && y < height) {
			image.setRGB(x, y, rgb);
		}
	}

	@Override
	public int hashCode() {
		return depth;
	}
	
	@Override
	public boolean equals(Object o) {
		return o.getClass() == Layer.class && ((Layer)o).depth == depth;
	}
	
	@Override
	public int compareTo(Layer o) {
		return depth - o.depth;
	}
}
