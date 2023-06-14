import java.util.Scanner;
public class ControlFlowExercises {
	public static void main(String[] args) {

//		int i = 5;
//		while (i <= 15){
//			System.out.println(i);
//			i++;
//		}

//		int i = 0;
//		do {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		} while (i <= 100);

//		int i = 100;
//		do {
//			if (i % 5 == 0) {
//				System.out.println(i);
//			}
//			i--;
//		} while (i >= -10);

//		int i = 2;
//		do {
//			System.out.println(i);
//			i = (int) Math.pow(i, 2);
//		} while (i <= 500000);

//		int i = 100;
//		for (i = 100; i >= -10; i--) {
//			if (i % 5 == 0){
//				System.out.println(i);
//			}
//		}

//		for (int i = 2; i <= 500000; i = (int) Math.pow(i, 2)) {
//			System.out.println(i);
//		}

//		int i = 1;
//		for (i = 1; i <= 100; i++){
//			 if (i % 5 == 0 && i % 3 == 0){
//				 System.out.println("FizzBuzz");
//			 } else if (i % 3 == 0){
//				 System.out.println("Fizz");
//			 } else if (i % 5 == 0){
//				 System.out.println("Buzz");
//			 } else{
//				 System.out.println(i);
//			 }
//		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("What number would you like to go up to?");
		int userInput1 = Integer.parseInt(scanner.next());

		System.out.println("Here's your table!");
		System.out.println("number | squared | cubed");
		System.out.println("------ | ------- | -----");

		int i = 1;
		for (;;){
			if(i <= userInput1){
				System.out.println(i + "      | "
						+ i * i
						+"       | "
						+ (int)Math.pow(i, 3));
				i++;
			}

		}

	}
}
