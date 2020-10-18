package tbs.geom;

public class Point2 {
	public final double x;
	public final double y;
	
	public Point2(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2 add(Point2 point) {
		return new Point2(this.x + point.x, this.y + point.y);
	}
	
	Point2 add(double x, double y) {
		return new Point2(this.x + x, this.y + y);
	}
	
	public Point2 rotate(double angle) {
		double sin = Math.sin(angle);
		double cos = Math.cos(angle);
		
		double x = this.x * cos - this.y * sin;
		double y = this.x * sin + this.y * cos;
		return new Point2(x, y);
	}
}
