package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the radius of your circle: ");
		double radius = scanner.nextDouble();

		Circle circle = new Circle(radius);

		double circumference = circle.getCircumference();
		double area = circle.getArea();

		System.out.println("Circumference: " + circumference);
		System.out.println("Area: " + area);
	}

}
