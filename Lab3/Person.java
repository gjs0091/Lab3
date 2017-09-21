
public class Person {
	static int currentYear = 2017;
	private String name;
	private int birthYear;
	private int age;
	
	//constructor
	public Person(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}

	
	public void reset_birthday(int year){
		birthYear = year;
	}
	//checks if age is greater than or equal to 65
	public void checkSenior() {
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}
	//Displays all information on the person
	public void display_info() {
		System.out.println("This is " + name);
		System.out.printf("I was born in %d. ",birthYear);
		age = currentYear - birthYear;
		System.out.printf("I am %d years old ",age);
		checkSenior();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.display_info();
		
		
	}

}