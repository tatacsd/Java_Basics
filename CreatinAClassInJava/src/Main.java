
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
		
		//it can also be accessed outside of the class Triangle
		System.out.println(triangleA.sideLenThree);
		System.out.println(triangleB.base);
		
		/*
		 * Non-static vs. static variables
		 * 
		 * non-static -> the values are not the same for the same object
		 * for this reason the values changes depending on the triangle instance (in this case).
		 *
		 * 
		 * static -> do not change per instance, it holds the value for the whole class to be used.
		 * 
		 */
		// To access a static variable use the class name + dot + the variable name
		System.out.println(Triangle.numOfSides);
	}

}
