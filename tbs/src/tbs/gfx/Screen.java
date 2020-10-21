package tbs.gfx;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Screen implements FrameListener {
	private static final int SUPER_LAYER = 1000;

	public final int width;
	public final int height;
	
	private final List<FrameListener> frameListeners = new ArrayList<>();
	private final TreeMap<Integer, Layer> layers = new TreeMap<>();
	private Layer baseLayer;
	private Layer superLayer;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		baseLayer = getLayer(0);
		superLayer = getLayer(SUPER_LAYER);
	}
	
	@Override
	public void onFrame() {
		superLayer.clear();
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
	
	public void clear() {
		baseLayer.fill();
	}

	public void setColour(int rgb) {
		baseLayer.setColour(rgb);
	}
	
	public void plot(int x, int y) {
		baseLayer.plot(x, y);
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
