package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

	public static void main(String[] args) {
		HashMap<String, Student> students = new HashMap<>();

		students.put("xavimedi", new Student("Xavier"));
		students.put("JohannWilliams", new Student("Johann"));
		students.put("IronMikeTyson", new Student("Mike Tyson"));
		students.put("totheskies1897", new Student("Amelia Earhart"));

		for(String s: students.keySet()){
			students.get(s).addGrade(90);
			students.get(s).addGrade(99);
			students.get(s).addGrade(100);
			students.get(s).addGrade(95);
		}

		System.out.println("Welcome!\n" +
				"Here are the GitHub usernames of our students:\n");

		for (String username : students.keySet()){
			System.out.print("|" + username + "| ");
		}

		Scanner input = new Scanner(System.in);
		String option;

		do {System.out.println("\n\nWhich student would you like to see more information on?");
			String username = input.nextLine();

			if (students.containsKey(username)) {
				Student student = students.get(username);
				System.out.println("Name: " + student.getName() + " - GitHub Username: " + username
				+ "\nCurrent Average: " + student.getGradeAverage());
			} else {
				System.out.println("\nSorry, no student found with the GitHub username of \"" + username + "\".");
			}

			System.out.println("\nWould you like to see another student? (y/n)");
			option = input.nextLine();
		}
		while (option.equalsIgnoreCase("y"));

		System.out.println("\nGoodbye, and have a wonderful day!");


	}
}
