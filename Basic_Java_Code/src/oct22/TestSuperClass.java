package oct22;
class Person{
	
}
class Employee extends Person{
	
}
public class TestSuperClass {
	public static void main(String[] args) {
		Person p1 = new Employee();
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Employee);
		Person p2 = new Person();
//		Employee e1 = (Employee)p2;
		System.out.println(p2 instanceof Employee);
		
	}

}
