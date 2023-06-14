import java.util.Scanner;

public class ControlStatementsAndLoopsLecture {
	public static void main(String[] args) {
		/* BOOLEAN EXPRESSIONS*/
		// Comparison Operators
//		//Let's start with what's the same
//		System.out.println(18 > 5);
//		System.out.println(18 < 55);
//		System.out.println(18 >= 5);
//		System.out.println(18 <= 28);

		// So what's new? Java is STRICTLY typed therefore, we no longer have the idea of strict equality/identity
//		System.out.println(22 === 22); No absolute equality
//		System.out.println(22 == 22);
//		System.out.println(22 !== 34); No absolute inequality
//		System.out.println(22 != 34);
//		System.out.println(18 == "18");
//		System.out.println(18 == Integer.parseInt("18"));

		/* LOGICAL OPERATORS */
//		System.out.println(true && false);  Prints false
//		System.out.println(true || false);  Prints true
//		System.out.println(true & true);  Prints true / unary version
//		System.out.println(false | false);  Prints false / unary version
//		System.out.println(!true);  Prints false

		/* STRING COMPARISON */
		//While tempting, the comparison of strings is handled differently in Java
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Type the letter 'y'");
//		String input = sc.next();
//		boolean wasItY = input == "y"; //this becomes false
//		boolean wasItY = input.equals("y"); //this becomes true
//		if (wasItY) {
//			System.out.println("THAT WAS IN FACT Y");
//		} else {
//			System.out.println("THAT WAS NOT IN FACT Y");
//		}

//		int randomNum = (int) Math.floor(Math.random() * 10);
//		System.out.println(randomNum);
//		for (int i = 1; i < 10; i++){
//			if (i == randomNum) {
//				System.out.println("Let's skip that number!");
//				continue;
//			} else if (i == randomNum + 5){
//				System.out.println("Alright, I'm done counting...");
//				break;
//			}
//			System.out.printf("Let's count! %d%n", i);
//		}

	}
}
