import java.util.GregorianCalendar;
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

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("What number would you like to go up to?");
//		int userInput1 = Integer.parseInt(scanner.next());
//
//		System.out.println("Here's your table!");
//		System.out.printf("%-7s| %-8s| %-6s%n", "number", "squared", "cubed");
//		System.out.println("------ | ------- | -----");
//
//		for (int i = 1; i <= userInput1; i++){
//			int square = (int)Math.pow(i, 2);
//			int cube = (int)Math.pow(i, 3);
//			System.out.printf("%-7d| %-8d| %-6d%n", i, square, cube);
//
//			}

		Scanner scanner = new Scanner(System.in);
		System.out.println("What's the number grade?");
		int gradeInput = Integer.parseInt(scanner.next());
		String gradeOutput = "";

		if (gradeInput >= 88 && gradeInput <= 100){
			gradeOutput = "A";
			if(gradeInput > 96){
				gradeOutput = gradeOutput + "+";
			}
			if(gradeInput < 94){
				gradeOutput = gradeOutput + "-";
			}
		}
		else if (gradeInput >= 80  && gradeInput <= 87){
			gradeOutput = "B";
			if(gradeInput > 84){
				gradeOutput = gradeOutput + "+";
			}
			if(gradeInput < 83){
				gradeOutput = gradeOutput + "-";
			}
		}
		else if (gradeInput >= 67 && gradeInput <= 79){
			gradeOutput = "C";
			if(gradeInput > 76){
				gradeOutput = gradeOutput + "+";
			}
			if(gradeInput < 70){
				gradeOutput = gradeOutput + "-";
			}
		}
		else if (gradeInput >= 60 && gradeInput <= 66){
			gradeOutput = "D";
			if(gradeInput > 63){
				gradeOutput = gradeOutput + "+";
			}
			if(gradeInput < 63){
				gradeOutput = gradeOutput + "-";
			}
		}
		else if (gradeInput <= 59){
			gradeOutput = "F";
		}
		System.out.printf("That is a(n) %s%n", gradeOutput);

		}

	}

