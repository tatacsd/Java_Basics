
public class Main {

	public static void main(String[] args) {
		// Creating Intances
		Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
		Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

		// Use the instance method (created in Triangle Class) to find the area
		// Of this triangle.
		double triangleArea = triangleA.findArea();
		System.out.println(triangleArea);
		
		double triangleBArea = triangleB.findArea();
		System.out.println(triangleBArea);
		
		// Triangle.findArea() --> Math.pow
		// instance method vs. class method
		
	}

}
