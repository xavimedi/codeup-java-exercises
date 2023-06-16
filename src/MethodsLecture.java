import java.util.Scanner;

public class MethodsLecture {

	public static String sayHello(String name) {
		return String.format("Hello, %s!", name);
	}

	public static void sayHello(int numberOfGreetings){
		for (int i = 0; i < numberOfGreetings; i++){
			System.out.println(sayHello());
		}
	}

	public static String sayHello() {
		return sayHello("World");
	}

	public static void login(Scanner scanner, int attemptsLeft){
		if (attemptsLeft == 0){
			System.out.println("No internet for you!");
		}else {
			System.out.println("Please enter your username:");
			String username = scanner.nextLine();
			System.out.println("Please enter your password:");
			String password = scanner.nextLine();
			if (username.equalsIgnoreCase("admin") && password.equals("P@SSw0rd")) {
				System.out.println("Welcome to internet!");
			} else {
				System.out.println("INVALID LOGIN");
				login(scanner, attemptsLeft - 1);
			}
		}
	}

	public static long raiseToPower(int base, int exponent){
		if (exponent <= 0){
			return 1;
		} else if (exponent == 1){
			return base;
		} else {
			return base * raiseToPower(base, exponent - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String name = scanner.nextLine();
//
//		System.out.println(sayHello(name));
//		System.out.println(sayHello("Xavier"));
//		System.out.println(sayHello());
//		sayHello(3);

		login(scanner, 3);

//		System.out.println(raiseToPower(2,4));
//		System.out.println(raiseToPower(4,15));

	}
}
