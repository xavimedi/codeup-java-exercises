public class HelloWorld {
	public static void main(String[] args) {
//		System.out.print("Hello, ");
//		System.out.print("World!");

//1
//		int myFavoriteNumber;
//		myFavoriteNumber = 85;

//2
//		System.out.println("myFavoriteNumber is " + 85);

//3
//		String myString;
//		myString = "3.14159";

//4-9
//		float myNumber;
//		myNumber = 3.14F;
//		System.out.println(myNumber);
//		//can't assign decimal as float without F
		// ??

//10
//		int x = 5;
//		System.out.println(x++);
//		System.out.println(x);

//		int x = 5;
//		System.out.println(++x);
//		System.out.println(x);
//		The placement of the ++ determines when the value of x is increased by 1. Before and it's immediate, after and it's after System.out.println(x++); is read and affects System.out.println(x);, similar to JS

//11
//		int class; can't do that

//12
//		String theNumberThree = "three";
//		Object o = theNumberThree;
//		int three = (int) o;

		//Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')

//		int three = (int) "three";
//		java.lang.String cannot be converted to int

//13
//		int x = 4;
//		x += 5;
//		System.out.println(x);

//		int x = 3;
//		int y = 4;
//		y *= x;
//		System.out.println(y);

//		int x = 10;
//		int y = 2;
//		x /= y;
//		y -= x;
//
//		System.out.println(x);
//		System.out.println(y);

//14
//		byte number;
//		number = 128;
//		System.out.println(number);
//		java: incompatible types: possible lossy conversion from int to byte

//		byte number;
//		number = 127;
//		System.out.println(number++);	127
//		System.out.println(number);		-128
//		the number was incremented beyond limit and started over from the lowest possible amount for that type

	}
}
