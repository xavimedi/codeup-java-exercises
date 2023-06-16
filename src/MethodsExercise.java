import java.util.Scanner;

public class MethodsExercise {

	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);
		System.out.println("Pick a method:");
		System.out.println("a - addition \n" + "s - subtraction \n" + "d - division \n" + "m - multiplication");
		String promptAnswer = prompt.nextLine();
		arithmetic(promptAnswer);

		range();

		do {
			factorial();
		} while (shouldContinue());

		do {
			diceRoller();
		} while (shouldContinue());

		numberGuesser();
	}

	//1 - Arithmetic
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static void arithmetic(String promptAnswer) {

		if (promptAnswer.equalsIgnoreCase("a")) {
			Scanner scannerAdd = new Scanner(System.in);
			System.out.println("Enter the first number to add");
			Integer num1add = Integer.valueOf(scannerAdd.nextLine());
			System.out.println("Enter the second number to add");
			Integer num2add = Integer.valueOf(scannerAdd.nextLine());
			System.out.println("Here's the addition result: " + add(num1add, num2add));
		} else if (promptAnswer.equalsIgnoreCase("s")) {
			Scanner scannerSub = new Scanner(System.in);
			System.out.println("Enter the number to subtract from");
			Integer num1sub = Integer.valueOf(scannerSub.nextLine());
			System.out.println("Enter the number to subtract");
			Integer num2sub = Integer.valueOf(scannerSub.nextLine());
			System.out.println("Here's the subtraction result: " + sub(num1sub, num2sub));
		} else if (promptAnswer.equalsIgnoreCase("d")) {
			Scanner scannerDiv = new Scanner(System.in);
			System.out.println("Enter the number to divide");
			Integer num1div = Integer.valueOf(scannerDiv.nextLine());
			System.out.println("Enter the number of divisions");
			Integer num2div = Integer.valueOf(scannerDiv.nextLine());
			System.out.println("Here's the division result: " + div(num1div, num2div));
			System.out.println("Here's the remainder: " + (num1div % num2div));
		} else if (promptAnswer.equalsIgnoreCase("m")) {
			Scanner scannerMul = new Scanner(System.in);
			System.out.println("Enter the first number to multiply");
			Integer num1mul = Integer.valueOf(scannerMul.nextLine());
			System.out.println("Enter the second number to multiply");
			Integer num2mul = Integer.valueOf(scannerMul.nextLine());
			System.out.println("Here's the multiplication result: " + mul(num1mul, num2mul));
		} else {
			System.out.println("Invalid entry");
		}
	}

	//2 - Range
	public static int getInteger(int min, int max) {
		Scanner rangeScanner = new Scanner(System.in);
		int userInput;
		boolean validEntry;

		do {
			userInput = rangeScanner.nextInt();
			validEntry = userInput >= min && userInput <= max;

			if (!validEntry) {
				System.out.print(userInput + " is not a number between " + min + " and " + max + ". Try Again: ");
			}
		} while (!validEntry);

		return userInput;
	}

	public static void range() {
		System.out.print("Enter a number between 1 and 10: ");
		int userInput = getInteger(1, 10);
		System.out.println("User input: " + userInput);
	}

	//3 - Factorial
	public static long calculateFactorial(int number) {
		long factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static void factorial() {
		Scanner factorialScanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 10 to calculate its factorial: ");
		int number = getInteger(1, 10);
		long factorial = calculateFactorial(number);

		System.out.print(number + "! = ");
		for (int i = 1; i <= number; i++) {
			System.out.print(i);
			if (i != number) {
				System.out.print(" x ");
			}
		}
		System.out.println(" = " + factorial);
	}

	//4 - Dice Roller
	public static void diceRoller() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of sides on your pair of dice: ");
		int numberOfSides = getInteger(1, Integer.MAX_VALUE);
		System.out.println("Press ENTER to roll the dice!");
		scanner.nextLine();

		rollDice(numberOfSides);
	}

	public static void rollDice(int numberOfSides) {
		int dice1 = generateRandomNumber(numberOfSides);
		int dice2 = generateRandomNumber(numberOfSides);

		System.out.println("Dice 1: " + dice1);
		System.out.println("Dice 2: " + dice2);

		if (dice1 == 1 && dice2 == 1) {
			System.out.println("SNAKE EYES!");
		}
	}

	public static int generateRandomNumber(int numberOfSides) {
		return (int) (Math.random() * numberOfSides) + 1;
	}

	//5 - Number Guesser
	public static void numberGuesser() {
		int randomNumber = generateRandomNumber(1, 100);
		boolean guesses = false;

		System.out.println("Welcome to the High-Low guessing game!");
		System.out.println("I have picked a random number between 1 and 100.");
		System.out.println("Let's see if you can guess it!");

		while (!guesses) {
			int userGuess = getUserGuess();
			if (userGuess < randomNumber) {
				System.out.println("HIGHER");
			} else if (userGuess > randomNumber) {
				System.out.println("LOWER");
			} else {
				System.out.println("YOU GOT IT!");
				guesses = true;
			}
		}
	}

	public static int generateRandomNumber(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static int getUserGuess() {
		Scanner scanner = new Scanner(System.in);
		int guess;

		while (true) {
			System.out.print("Enter your guess: ");
			if (scanner.hasNextInt()) {
				guess = scanner.nextInt();
				break;
			} else {
				String input = scanner.next();
				System.out.println("Invalid input. Please enter a valid integer.");
			}
		}

		return guess;
	}
	public static boolean shouldContinue() {
		Scanner continueScanner = new Scanner(System.in);
		System.out.print("Do you want to continue? (Y/N): ");
		String answer = continueScanner.nextLine().toLowerCase();

		while (!answer.equals("y") && !answer.equals("n")) {
			System.out.print("Incorrect entry, try again. (Y/N): ");
			answer = continueScanner.nextLine().toLowerCase();
		}

		return answer.equals("y");
	}
}

// David's Walkthrough

//public class MethodsExercise {
//
//	public static final Scanner scanner = new Scanner(System.in);
//
//	public static int addition(int x, int y){
//		return x + y;
//	}
//
//	public static int subtraction(int x, int y){
//		return x - y;
//	}
//
//	public static int multiplication(int x, int y){
//		return x * y;
//	}
//
//	public static int division(int x, int y){
//		return x / y;
//	}
//
//	public static int remainder(int x, int y){
//		return x % y;
//	}
//
//	public static int getInteger(int min, int max){
//		System.out.printf("Please enter an integer between %d and %d: ", min, max);
//		int userNumber = scanner.nextInt();
//		if (userNumber < min || userNumber > max){
//			System.out.println("Invalid input. Number out of range");
//			return getInteger(min, max);
//		} else{
//			System.out.println("Thank you.");
//			return userNumber;
//		}
//	}
//
//	public static void printFactorial(){
//		int userNum = getInteger(1, 10);
//		String factorialButPretty = "";
//		for (int i = 1; i <= userNum; i++){
//			int factorialAnswer = 1;
//			factorialButPretty = String.format("%s%d! = ", factorialButPretty, i);
//			for (int j = 1; j <= i; j++){
//				factorialAnswer *= j;
//				if(j == i) {
//					factorialButPretty = String.format("%s %d = ", factorialButPretty, j);
//				} else {
//					factorialButPretty = String.format("%s %d x ", factorialButPretty, j);
//				}
//			}
//			factorialButPretty = String.format("%s%d%n", factorialButPretty, factorialAnswer);
//			System.out.println(factorialButPretty);
//		}
//	}
//
//	public static int rollDie(int sides){
//		return (int)Math.floor(Math.random() * sides + 1);
//	}
//
//	public static void rollDiceGame(){
//		System.out.println("How many sides do you want your dice to have?");
//		int sides = getInteger(2, 100);
//		int roll1 = rollDie(sides);
//		int roll2 = rollDie(sides);
//		System.out.printf("You rolled a %d and a %d, for a total of %d. ", roll1, roll2, addition(roll1, roll2));
//		System.out.println("Do you wish to roll again?");
//		scanner.nextLine();
//		String answer = scanner.nextLine();
//		if (answer.equalsIgnoreCase("yes")){
//			rollDiceGame();
//		}
//	}
//
//	public static void main(String[] args){
////		System.out.println(addition(2, 3));
////		System.out.println(subtraction(2, 3));
////		System.out.println(multiplication(2, 3));
////		System.out.println(division(6, 3));
////		System.out.println(remainder(7, 3));
//
////		System.out.println(getInteger(1, 10));
////		printFactorial();
//
//		rollDiceGame();
//
//	}
//}
