package util;

public class InputTest {
	public static void main(String[] args) {
		Input input = new Input();

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

		int binary = Integer.parseInt(input.getBinary());
		System.out.printf("Binary number conversion: " + binary + "\n");

		throw new RuntimeException("Hex converter not yet created, lunch time");

//		int hex = input.getHex();
//		System.out.println("Enter an integer to convert to Hexadecimal:");
//		System.out.printf("Binary number of %d: %d", input, binary);

	}
}
