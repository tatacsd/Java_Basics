
public class Triangle {
	double base;
	double height;
	double sideLenOne;
	double sideLenTwo;
	double sideLenThree;
	
	//constructor
	public Triangle(double base, double height,
			double sideLenOne, double sideLenTwo,
			double sideLenThree) {
		this.base = base;
		this.height = height;
		this.sideLenOne = sideLenOne;
		this.sideLenTwo = sideLenTwo;
		this.sideLenThree = sideLenThree;
		//it is highlighted because it is being used by the computer.
	}
	
	public double findArea() {
		// Area formula
		return (this.base * this.height) / 2;
	}

}
