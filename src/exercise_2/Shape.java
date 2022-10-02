package exercise_2;

public class Shape {
	private String color;
	private boolean filled;
	
	// Task 2.1 Shape Number 2
	public Shape() {
		this.setColor("green");
		this.setFilled(true);
	}
	
	// Task 2.1 Shape Number 1
	public Shape(String color, boolean filled) {
		this.setColor(color);
		this.setFilled(filled);
	}
	
	// Task 2.1 Shape Number 3
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// Task 2.1 Shape Number 4
	public String toString() {
		return "A shape with color of " + color + " and " 
	+ (filled ? "Filled":"Not Filled");
	}
}
