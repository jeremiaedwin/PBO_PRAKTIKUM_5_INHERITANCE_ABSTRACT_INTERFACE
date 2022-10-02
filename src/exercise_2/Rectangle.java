package exercise_2;

public class Rectangle extends Shape {
	// Task 2.1 Rectangle Number 1
	private double width;
	private double length;
	
	// Task 2.1 Rectangle Number 2
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	// Task 2.1 Rectangle Number 3
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	// Task 2.1 Rectangle Number 4
	public double getArea() {
		return getLength()*getWidth();
	}
	
	public double getPerimeter() {
		return 2*(getLength()+getWidth());
	}
	
	// Task 2.1 Rectangle Number 5
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A Rectangle with width="+width+ " and "
				+ "length="+length+" , which is a subclass of "
				+super.toString();
				
	}
}
