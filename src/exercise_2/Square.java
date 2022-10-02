package exercise_2;

public class Square extends Rectangle{
	private double side;
	
	// Task 2.1 Square Number 1
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return side;
	}
	
	// Task 2.1 Square Number 4
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		setSide(side);
	}
	
	public void setWidth(double side) {
		setSide(side);
	}
	
	// Task 2.1 Square Number 2
	@Override
	public String toString() {
		return "A Square with side="+side+ " and "
				+ "which is a subclass of "
				+super.toString();
				
	}
	
	// Task 2.1 Square Number 3
	@Override
	public double getPerimeter() {
		return 4*getSide();
	}
	
	@Override
	public double getArea() {
		return getSide()*getSide();
	}
}
