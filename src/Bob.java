import java.util.Scanner;

public class Bob {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What's up? My name is Bob.");
		String input = scanner.nextLine();

		if (input.isEmpty()){
			System.out.println("Huh?");
		}
		else if(input.endsWith("?")){
			System.out.println("Sure, dude.");
		}
		else if(input.endsWith("!")){
			System.out.println("Hey, stop yelling at me.");
		}
		else {
			System.out.println("I don't even know what you're saying, dude.");
		}
	}
}
