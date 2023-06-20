package util;

public class InputTest {
	public static void main(String[] args) {
		Input input = new Input();

		System.out.print("Please enter a string: ");
		String str = input.getString();

		System.out.print("Please enter yes or no (y/n): ");
		boolean yesOrNo = input.yesOrNo();

		int min = 1;
		int max = 10;
		int numInRange = input.getInt(min, max);
		System.out.printf("Integer between %d and %d entered: %d%n", min, max, numInRange);

		int num = input.getInt();
		System.out.println("Integer entered: " + num);

		double minDouble = 1.0;
		double maxDouble = 10.0;
		double doubleInRange = input.getDouble(minDouble, maxDouble);
		System.out.printf("Double between %.2f and %.2f entered: %.2f%n", minDouble, maxDouble, doubleInRange);

		double decimal = input.getDouble();
		System.out.println("Double entered: " + decimal);
	}
}
