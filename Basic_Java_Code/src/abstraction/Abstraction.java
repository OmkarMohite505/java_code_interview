package abstraction;

abstract class Person{
	public abstract void displayPerson();
	public void displayAge() {
		System.out.println("Printing age");
	}
}

class Employee extends Person{

	@Override
	public void displayPerson() {
		System.out.println("From inherited displayPerson method from Employee Class");
	}
	
}
class Manager extends Employee{
	
}

public class Abstraction {
	public static void main(String[] args) {
		new Manager().displayPerson();
		new Manager().displayAge();
	}

}
