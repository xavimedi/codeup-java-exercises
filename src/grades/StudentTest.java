package grades;

public class StudentTest {
	public static void main(String[] args) {

		Student student = new Student("Xavier");

		student.addGrade(98.00);
		student.addGrade(94.00);
		student.addGrade(99.00);
		student.addGrade(100.00);
		student.addGrade(75.00);
		student.addGrade(98.00);
		student.addGrade(91.00);
		student.addGrade(99.00);

		System.out.println("Average grade for " + student.getName() + ": " + student.getGradeAverage());
	}
}
