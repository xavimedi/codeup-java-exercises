package util;
import java.util.Scanner;

public class Input {
	private Scanner scanner;

	public Input(){
		this.scanner = new Scanner(System.in);
	}

	public String getString(){
		return this.scanner.nextLine();
	}

	public boolean yesOrNo(){
		System.out.println("Yes or No? (y/n)");
		String input = this.scanner.nextLine().toLowerCase();
		return input.equals("y") || input.equals("yes") || input.equals("yeah") || input.equals("sure");
	}

	public int getInt(int min, int max){
		this.scanner = new Scanner(System.in);
		int num;

		System.out.printf("Please enter an integer between %d and %d: ", min, max);
		while (!this.scanner.hasNextInt()) {
			this.scanner.next();
		}
		num = this.scanner.nextInt();
		this.scanner.nextLine();

		if (num < min || num > max) {
			System.out.printf("%d is not within the range. ", num);
			num = getInt(min, max);
		}
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
		while (!this.scanner.hasNextDouble()) {
			System.out.println("Invalid input. Please enter a decimal number.");
			this.scanner.next();
		}
		double num = this.scanner.nextDouble();
		this.scanner.nextLine();
		return num;
	}
}
