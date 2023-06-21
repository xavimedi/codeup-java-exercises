public class Person {
	public Person(String name){
		this.name = name;
		System.out.println(this.name + " has been created!");
	}

	private String name;

	public static void main(String[] args){
		Person person0 = new Person("Jack");
		System.out.print(person0.name + " has been renamed to: ");

		person0.setName("John");
		System.out.println(person0.getName());

		person0.sayHello();

//		Person person1 = new Person("John");
//		Person person2 = new Person("John");
//		System.out.println(person1.getName().equals(person2.getName())); //true
//		System.out.println(person1 == person2); //false

//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1 == person2); //true, because it was given the value of person1 directly

//		Person person1 = new Person("John"); //triggers constructor
//		Person person2 = person1;
//		System.out.println(person1.getName()); // John
//		System.out.println(person2.getName()); // John
//		person2.setName("Jane");
//		System.out.println(person1.getName()); // Jane
//		System.out.println(person2.getName()); // Jane
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println(name + " says hello!");
	}

}
