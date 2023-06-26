import java.util.Arrays;

public class ArraysExercises {

	public static Person[] addPerson(Person[] peopleArray, Person newPerson) {

		int length = peopleArray.length;
		Person[] newPersons = Arrays.copyOf(peopleArray, length + 1);
		newPersons[length] = newPerson;
		return newPersons;
	}

	public static void main(String[] args){

		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println("location in memory: " + numbers);
		System.out.println(Arrays.toString(numbers)); // converts to string for sout

		Person[] people = new Person[3];
		people[0] = new Person("Hank");
		people[1] = new Person("Bill");
		people[2] = new Person("Dale");


		System.out.println("Initial list of people:");
		for (Person person : people){
			System.out.println(person.getName());
		}

		people = addPerson(people, new Person("Boomhauer"));

		System.out.println("List after adding a new person:");
		for (Person person : people){
			System.out.println(person.getName());
		}

	}
}