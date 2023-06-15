import java.util.Scanner;

public class Bob {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What's up? My name is Bob.");
//		String input = scanner.nextLine();

		String userResponse;

		do {
			System.out.println("What do you want?");
			userResponse = scanner.nextLine();
			if(userResponse.endsWith("?")){
				System.out.println("Sure, dude.");
			}
			else if(userResponse.endsWith("!")){
				System.out.println("Hey, stop yelling at me.");
			}
			else if(userResponse.trim().equals("")){
				System.out.println("What are you talking about?");
			}
			else if(userResponse.equalsIgnoreCase("BYE")){
				System.out.println("Later, nerd.");
			}
			else{
				System.out.println("Huh?");
			}
		} while(!userResponse.equalsIgnoreCase("BYE"));

//		if (input.isEmpty()){
//			System.out.println("Huh?");
//		}
//		else if(input.endsWith("?")){
//			System.out.println("Sure, dude.");
//		}
//		else if(input.endsWith("!")){
//			System.out.println("Hey, stop yelling at me.");
//		}
//		else {
//			System.out.println("I don't even know what you're saying, dude.");
//		}
	}
}
