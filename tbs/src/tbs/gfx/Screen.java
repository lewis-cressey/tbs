package tbs.gfx;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import tbs.geom.Vec2D;

public class Screen implements FrameListener {
	private static final int SUPER_LAYER = 1000;

	public final int width;
	public final int height;
	
	private final List<FrameListener> frameListeners = new ArrayList<>();
	private final TreeMap<Integer, Layer> layers = new TreeMap<>();
	private Layer baseLayer;
	private Layer superLayer;
	private Graphics2D graphics;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		baseLayer = getLayer(0);
		superLayer = getLayer(SUPER_LAYER);
		graphics = baseLayer.createGraphics();
	}
	
	@Override
	public void onFrame() {
		Graphics2D superLayerGraphics = superLayer.getGraphics();
		superLayerGraphics.setComposite(AlphaComposite.Clear);
		superLayerGraphics.fillRect(0, 0, width, height);
		superLayerGraphics.setComposite(AlphaComposite.SrcOver);

		for (FrameListener listener : frameListeners) {
			listener.onFrame();
		}
	}
	
	public Layer getLayer(int depth) {
		while (!layers.containsKey(depth)) {
			Layer layer = new Layer(width, height, depth);
			layers.put(depth, layer);
		}
		return layers.get(depth);
	}
	
	public Vec2D unproject(Vec2D point) {
		double[] pt = new double[] { point.x, point.y };
		getLayer(0).getInverseTransform().transform(pt, 0, pt, 0, 1);
		return new Vec2D(pt[0], pt[1]);
	}
	
	public void fill() {
		graphics.fillRect(-width / 2, -height / 2, width, height);
	}

	public void setColour(int rgb) {
		graphics.setColor(new Color(rgb));	
	}
	
	public void plot(int x, int y) {
		graphics.fillRect(x, y, 1, 1);
	}
	
	public void drawImage(Image image, int x, int y) {
		int width = image.getWidth(null);
		int height = image.getHeight(null);
		x -= width / 2;
		y -= height / 2;
		graphics.drawImage(image, x, y, x + width, y + height, 0, height, width, 0, null);
	}
	
	public void fillRect(int x1, int y1, int width, int height) {
		graphics.fillRect(x1, y1, width, height);
	}

	public void drawLine(int x1, int y1, int x2, int y2) {
		graphics.drawLine(x1, y1, x2, y2);
	}
	
	public void addFrameListener(FrameListener frameListener) {
		frameListeners.add(frameListener);
	}
	
	public Turtle createTurtle() {
		Turtle turtle = new Turtle(baseLayer.createGraphics(), superLayer.createGraphics(), 10);
		addFrameListener(turtle);
		return turtle;
	}
	
	public void paint(Graphics2D g) {
		g.setComposite(AlphaComposite.SrcOver);
		for (Integer depth : layers.keySet()) {
			g.drawImage(layers.get(depth).getImage(), 0, 0, null);
		}
	}
}
