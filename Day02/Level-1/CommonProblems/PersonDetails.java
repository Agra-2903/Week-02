// Person class created
class Person{
	// Declare attribute
	private String name;
	private String gender;
	private int age;
	
	// Parameterized constructor
	public Person(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	// Copy constructor
	public Person(Person previousPerson){
		this.name = previousPerson.name;
		this.gender = previousPerson.gender;
		this.age = previousPerson.age;
	}
	
	public void displayDetails(){
		System.out.println("Person Name: " + name);
		System.out.println("Person Gender: " + gender);
		System.out.println("Age: " + age);
	}
}

class PersonDetails{
	public static void main(String[]args){
	    
		// Person objects
        Person person1 = new Person("Kushagra", "Male", 60000);
		Person person2 = new Person(person1);
		
		System.out.println("===Person-1 Details===");
		person1.displayDetails();
		System.out.println("===Person-1 Details using Copy Constructor===");
		person2.displayDetails();
		
	}
}