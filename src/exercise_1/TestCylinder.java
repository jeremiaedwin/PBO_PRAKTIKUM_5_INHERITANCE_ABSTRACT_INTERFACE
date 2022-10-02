package exercise_1;

public class TestCylinder {
	public static void main(String[] args) {
		cylinder c1 = new cylinder();
		System.out.println("Cylinder: "
				+ " radius = " + c1.getRadius()
				+ " height = " + c1.getHeight()
				+ " base area = " + c1.getArea()
				+ " volume = " + c1.getVolume()
				+ c1.toString()
			);
		
		cylinder c2 = new cylinder(10.0);
		System.out.println("Cylinder: "
				+ " radius = " + c2.getRadius()
				+ " height = " + c2.getHeight()
				+ " base area = " + c2.getArea()
				+ " volume = " + c2.getVolume()
				+ c2.toString()
			);
		
		cylinder c3 = new cylinder(2.0, 10.0);
		System.out.println("Cylinder: "
				+ " radius = " + c3.getRadius()
				+ " height = " + c3.getHeight()
				+ " base area = " + c3.getArea()
				+ " volume = " + c3.getVolume()
				+ c3.toString()
			);
	}
}
