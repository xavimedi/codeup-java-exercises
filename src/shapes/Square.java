package shapes;

public class Square extends Rectangle{


	public Square(double side) {
		super(side, side);
	}

	@Override
	public double getArea() {
		double side = length;
		return side * side;
	}

	@Override
	public double getPerimeter() {
		double side = length;
		return 4 * side;
	}

//	public double getArea(){
//		return length * width;
//	}

//	public double getPerimeter() {
//		return (length * 2) + (width * 2);
//	}
}