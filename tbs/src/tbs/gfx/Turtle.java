package tbs.gfx;

import java.awt.Color;
import java.awt.Graphics2D;

import tbs.geom.Point2;

public class Turtle implements FrameListener {
	private static final double TAO = Math.PI * 2;

	private final Graphics2D paintGraphics;
	private final Graphics2D overGraphics;
	private double size;
	private Point2 point;
	private double angle;
	private boolean isPenDown = true;
	
	public Turtle(Graphics2D paintLayer, Graphics2D overLayer, int size) {
		this.size = size;
		paintGraphics = paintLayer;
		overGraphics = overLayer;
		this.point = new Point2(0, 0);
		this.angle = 0;
		
		setColour(0xffffff);
	}
	
	public Point2 getPoint() {
		return point;
	}
	
	public double getAngle() {
		return angle * 360 / TAO;
	}
	
	public boolean getPenDown() {
		return isPenDown;
	}
	
	public void setColour(int rgb) {
		Color c = new Color(rgb);
		paintGraphics.setColor(c);
		overGraphics.setColor(c);
	}
	
	public void setPoint(Point2 point) {
		this.point = point;
	}

	public void setPoint(double x, double y) {
		this.point = new Point2(x, y);
	}
	
	public void setPenDown(boolean isPenDown) {
		this.isPenDown = isPenDown;
	}
	
	public void move(double distance) {
		int x1 = (int)Math.round(point.x);
		int y1 = (int)Math.round(point.y);
		Point2 vector = new Point2(distance, 0).rotate(angle);
		point = point.add(vector);		
		int x2 = (int)Math.round(point.x);
		int y2 = (int)Math.round(point.y);
		if (isPenDown) paintGraphics.drawLine(x1, y1, x2, y2);
	}
	
	public void rotate(double angle) {
		angle *= TAO / 360;
		this.angle = (this.angle + angle) % TAO;
		this.angle = (this.angle + TAO) % TAO;
	}
	
	@Override
	public void onFrame() {
		Point2 points[] = { 
				new Point2(size, 0),
				new Point2(-size / 4, size / 2),
				new Point2(0, 0), 
				new Point2(-size / 4, -size / 2)
		};
		
		Point2 src = point.add(points[points.length - 1].rotate(angle));
		int x1 = (int)Math.round(src.x);
		int y1 = (int)Math.round(src.y);
		
		for (Point2 dst : points) {
			dst = point.add(dst.rotate(angle));
			int x2 = (int)Math.round(dst.x);
			int y2 = (int)Math.round(dst.y);
			
			overGraphics.drawLine(x1, y1, x2, y2);
			
			x1 = x2;
			y1 = y2;
		}
	}	
}
