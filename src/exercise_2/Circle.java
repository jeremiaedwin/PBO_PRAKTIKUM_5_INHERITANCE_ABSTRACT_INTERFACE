package exercise_2;

public class Circle extends Shape{
	private double radius;
	
	// Task 2.1 Circle Number 2
	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	// Task 2.1 Circle Number 1
	public Circle(double r) {
		super();
		this.radius = r;
	}
	
	public Circle(double r, String color, boolean filled) {
		super(color, filled);
		this.radius = r;
	}
	
	// Task 2.1 Circle Number 3
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Task 2.1 Circle Number 4
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return Math.PI*(radius*2);
	}
	
	// Task 2.1 Circle Number 5
	@Override
	public String toString() {
		return "A Circle with radius = " + radius + " which is "
				+ "subclass "
				+ "of Shape" ;
	}
}
