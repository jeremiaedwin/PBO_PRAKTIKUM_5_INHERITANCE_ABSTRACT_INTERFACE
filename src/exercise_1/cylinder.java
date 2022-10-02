package exercise_1;

public class cylinder extends circle{
	private double height;
	
	public cylinder() {
		super();
		height = 1.0;
	}
	
	public cylinder(double height) {
		super();
		this.height = height;
	}
	
	public cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return super.getArea()*height;
	}
	
	// Task 1.2
	public double getArea() {
		return (2*Math.PI*getRadius()*getHeight()) + (2*super.getArea());
	}
	
	// Task 1.3
	public String toString() { 
		return "Cylinder: subclass of " + super.toString() 
		 + " height=" + height;
	}

}
