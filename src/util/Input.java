package util;
import java.util.Scanner;

public class Input {
	private Scanner scanner;

	public Input() {
		scanner = new Scanner(System.in);
	}

	public String getString() {
		return scanner.nextLine();
	}

	public boolean yesOrNo(){
		String input = scanner.nextLine().toLowerCase();
		return input.equals("y") || input.equals("yes") || input.equals("yeah") || input.equals("sure");
	}

	public int getInt(int min, int max) {
		int num;
		do {
			System.out.printf("Please enter an integer between %d and %d: ", min, max);
			while (!scanner.hasNextInt()) {
				System.out.println("Invalid input. Please enter an integer.");
				scanner.next();
			}
			num = scanner.nextInt();
			scanner.nextLine();
		} while (num < min || num > max);
		return num;
	}

	public int getInt() {
		System.out.print("Please enter an integer: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Invalid input. Please enter an integer.");
			scanner.next();
		}
		int num = scanner.nextInt();
		scanner.nextLine();
		return num;
	}

	public double getDouble(double min, double max) {
		double num;
		do {
			System.out.printf("Please enter a decimal number between %.2f and %.2f: ", min, max);
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalid input. Please enter a decimal number.");
				scanner.next();
			}
			num = scanner.nextDouble();
			scanner.nextLine();
		} while (num < min || num > max);
		return num;
	}

	public double getDouble() {
		System.out.print("Please enter a decimal number: ");
		while (!scanner.hasNextDouble()) {
			System.out.println("Invalid input. Please enter a decimal number.");
			scanner.next();
		}
		double num = scanner.nextDouble();
		scanner.nextLine();
		return num;
	}
}
