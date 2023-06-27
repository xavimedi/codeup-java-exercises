package shapes;

public class Square extends Rectangle{


	public Square(double side) {
		super(side, side);
	}


	public double getArea() {
		System.out.println("Square method");
		double side = this.length;
		return side * side;
	}


	public double getPerimeter() {
		System.out.println("Square method");
		double side = this.length;
		return 4 * side;
	}

//	public double getArea(){
//		return length * width;
//	}

//	public double getPerimeter() {
//		return (length * 2) + (width * 2);
//	}
}