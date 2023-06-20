public class Student {
	public String name;
	public String cohort;

	private double grade;

	public double getGrade(){
		return grade;
	}

	public Student(String studentName) {
		name = studentName;
		cohort = "Unassigned";
	}

	public Student(String studentName, String assignedCohort) {
		name = studentName;
		cohort = assignedCohort;
	}

	public Student(String studentName, double grade) {
		name = studentName;
		grade = 80.0;
	}

	public String getInfo() {
		return String.format("name: %s, cohort: %s", name, cohort);
	}

	public static void main(String[] args) {
		Student s1 = new Student("Student A");
		Student s2 = new Student("Student B", "Voyagers");
		System.out.println(s1.getInfo()); // "name: Student A cohort: Unassigned"
		System.out.println(s2.getInfo()); // "name: Student B cohort: Voyagers"
	}
}

