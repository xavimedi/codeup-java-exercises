package shapes;

public class ShapesTest {
	public static void main(String[] args) {

		Rectangle box1 = new Rectangle(4, 5);

		System.out.println("Rect perimeter: " + box1.getPerimeter());
		System.out.println("Rect area: " + box1.getArea());

		Rectangle box2 = new Square(5);

		System.out.println("Square perimeter: " + box2.getPerimeter());
		System.out.println("Squarea: " + box2.getArea());

//		Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
// 		I added identifying information to the sout

	}
}
