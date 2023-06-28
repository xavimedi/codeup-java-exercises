package grades;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Double> grades;

	public Student(String name) {
		this.name = name;
		this.grades = new ArrayList<>();
	}

	// returns the student's name
	public String getName() {
		return this.name;
	}

	// adds the given grade to the grades property
	public void addGrade(double grade) {
		grades.add(grade);
	}

	// returns the average of the students grades
	public double getGradeAverage() {
		if (grades.isEmpty()) {
			return 0.0;
		}

		double sum = 0.0;
		for (double grade : grades) {
			sum += grade;
		}
		return sum / grades.size();
	}

//	public static void main(String[] args) {
//
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Welcome to the Grade Tracker 9000!\n" +
//				"Please enter the student's name:");
//
//		String studentName = userInput.nextLine();
//		Student student = new Student(studentName);
//
//		while (true){
//			System.out.println("\nPlease select an option:\n" +
//					"1 - Retrieve student name\n" +
//					"2 - Add grade\n" +
//					"3 - Calculate average grade\n" +
//					"4 - Exit");
//
//			int userSelection = userInput.nextInt();
//			userInput.nextLine();
//
//			if (userSelection == 1) {
//				System.out.println("Student's name: " + student.getName());
//			} else if (userSelection == 2){
//				System.out.println("Enter grade for " + student.name + ": ");
//				double grade = userInput.nextDouble();
//				student.addGrade(grade);
//				System.out.println("Grade added.");
//			} else if (userSelection == 3){
//				System.out.println("Average grade for " + student.name + ": " + student.getGradeAverage());
//			} else if (userSelection == 4){
//				System.out.println("Goodbye...");
//				break;
//			} else {
//				System.out.println("Invalid selection");
//			}
//		}
//	}
}
