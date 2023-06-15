import java.util.Scanner;

public class StringsLecture {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("type abc");
//
//		String userString = scanner.nextLine();
//		String str = "abc";
//		String str2 = "abc";
//		String newStr = str + "def";
//
//		System.out.println("abc" == "abc");
//		System.out.println(str == "abc");
//		System.out.println(str == str2);
//		System.out.println(str == userString);
//		System.out.println(str.equals(userString));
//		System.out.println(newStr == "abcdef");
//
//		String jeff = "jeff";
//		String loudJeff = "JEFF";
//
//		System.out.println(jeff.equals(loudJeff)); //false
//		System.out.println(jeff.equalsIgnoreCase(loudJeff)); //true
//
//		String startsWithB = "bob";
//		String alsoStartsWithB = "barbarian";
//
//		System.out.println(startsWithB.startsWith("b")); //true
//		System.out.println(alsoStartsWithB.startsWith("B")); //false

		// string method rundown
		//charAt
		String cosmos = "COSMOS";
		char thirdIndex = cosmos.charAt(3);
		System.out.println(thirdIndex); // M

		//indexOf
		String mo = "MO";
		String moe = "MOE";
		System.out.println(cosmos.indexOf(thirdIndex)); // 3
		System.out.println(cosmos.indexOf(mo)); // 3
		System.out.println(cosmos.indexOf(moe)); // -1

		// length
		System.out.println(cosmos.length());

		// replace
		String mascot = "Codey The Duck";
		String instructor = mascot.replace("ey The Duck", "y Hastings");
		System.out.println(mascot);
		System.out.println(instructor);

		// substring
		String animal = mascot.substring(10);
		String article = mascot.substring(6, 9);
		System.out.println(animal);
		System.out.println(article);

		// trim
		String spaceyJeff = "       jeff          ";
		System.out.println(spaceyJeff.trim());
		System.out.println(spaceyJeff);

		// format
		String name = "Joe";
		String factory = "button";
		String formattedString = String.format("Hello, my name is %s and I work in a %s factory", name, factory);
		System.out.println(formattedString);


	}
}
