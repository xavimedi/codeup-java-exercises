package util;

import java.util.Scanner;

public class Input {
	private Scanner scanner;

	public Input() {
		this.scanner = new Scanner(System.in);
	}

	public String getString() {
		return this.scanner.nextLine();
	}

	public boolean yesOrNo() {
		System.out.println("Yes or No? (y/n)");
		String input = this.scanner.nextLine().toLowerCase();
		return input.equals("y") || input.equals("yes") || input.equals("yeah") || input.equals("sure");
	}

	public int getInt(int min, int max) {
		this.scanner = new Scanner(System.in);
		int num = 0;
		boolean valid = false;

		do {
			System.out.printf("Please enter an integer between %d and %d: ", min, max);
			String input = scanner.nextLine();

			try {
				num = Integer.parseInt(input);
				if (num >= min && num <= max) {
					valid = true;
				} else {
					System.out.printf("%d is not in the range", num);
				}
			} catch (NumberFormatException exception) {
				System.out.println("That's not an INTEGER.");
			}
		} while (!valid);

		return num;
	}

	public int getInt() {
		System.out.print("Please enter an integer: ");
		String input = scanner.nextLine();

		try {
			return Integer.valueOf(input);
		} catch (NumberFormatException exception) {
			System.out.println("That's not an INTEGER.");
			return getInt();
		}
	}

	public double getDouble(double min, double max) {
		String input;
		double num = 0;

		do {
			System.out.printf("Please enter a decimal number between %.2f and %.2f: ", min, max);
			input = scanner.nextLine();

			try {
				num = Double.valueOf(input);
				if (num < min || num > max) {
					System.out.println("Number is not within the range.");
				}
			} catch (NumberFormatException exception) {
				System.out.println("Please enter a DECIMAL NUMBER.");
			}
		} while (num < min || num > max);

		return num;
	}

	public double getDouble() {
		System.out.print("Please enter a decimal number: ");
		double num = 0;

		try {
			String input = this.scanner.nextLine();
			num = Double.parseDouble(input);
		} catch (NumberFormatException exception) {
			throw new RuntimeException("Please enter a DECIMAL number.");
		}

		return num;
	}

	public String getBinary() {
		System.out.println("Enter an integer to convert to Binary:");
		int num = 0;

		try {
			String input = this.scanner.nextLine();
			num = Integer.parseInt(input);
		} catch (NumberFormatException exception) {
			throw new RuntimeException("Please enter an INTEGER to convert to binary.");
		}

		return Integer.toBinaryString(num);
	}



}
