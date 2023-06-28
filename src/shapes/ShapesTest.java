package shapes;

public class ShapesTest {
	public static void main(String[] args) {

		Measurable myShape = new Rectangle(4, 5);
		System.out.println("myShape.getArea() = " + myShape.getArea());
		System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
//		System.out.println("myShape.getLength() = " + myShape.getLength());
//		System.out.println("myShape.getWidth() = " + myShape.getWidth());

		myShape = new Square(5);
		System.out.println("myShape.getArea() = " + myShape.getArea());
		System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

		Quadrilateral myQuad = new Square(7);
		System.out.println("myQuad.getArea() = " + myQuad.getArea());
		System.out.println("myQuad.getPerimeter() = " + myQuad.getPerimeter());
		System.out.println("myQuad.getLength() = " + myQuad.getLength());

	}

//	Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
// java: shapes.Rectangle is not abstract and does not override abstract method getPerimeter() in shapes.Measurable

//	What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
// java: cannot find symbol
//  symbol:   method getLength()
//  location: variable myShape of type shapes.Measurable
// It's outside the scope of myShape

//		Rectangle box1 = new Rectangle(4, 5);
//
//		System.out.println("Rect perimeter: " + box1.getPerimeter());
//		System.out.println("Rect area: " + box1.getArea());
//
//		Rectangle box2 = new Square(5);
//
//		System.out.println("Square perimeter: " + box2.getPerimeter());
//		System.out.println("Squarea: " + box2.getArea());

//		Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
// 		I added identifying information to the sout

	}

