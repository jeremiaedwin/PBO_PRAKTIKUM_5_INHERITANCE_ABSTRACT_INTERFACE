package exercise_1;

public class circle {
	private double radius;
	private String color;
	
	public circle() {
		radius = 1.0;
		color = "red";
	}
	
	public circle(double r) {
		radius = r;
		color = "red";
	}
	
	public circle(double r, String color) {
		radius = r;
		color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}
