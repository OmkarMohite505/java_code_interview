package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	int age;
	public Employee() {
		
	}
	public Employee(int id, String name, double salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee o) {
		Integer eid = id;
//		return eid.compareTo(o.id);
		return name.compareTo(o.name);
		
	}
	
}
class EmployeeSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

public class EmployeeArrayList {

	public static void main(String[] args) {
		Employee emp1 = new Employee(11,"Omkar",2345.54,25);
		Employee emp2 = new Employee(2,"Ram",34875.54,29);
		Employee emp3 = new Employee(3,"Akshay",7645.54,20);
		Employee[] empArr = new Employee[10];
		empArr[0] = emp1;
		empArr[1] = emp2;
		empArr[2] = emp3;
//		for (Employee employee : empArr) {
//			if(employee != null)
//			System.out.println(employee);
//		}
		
		List<Employee> empList = new ArrayList<>();
		
//		empList.addAll(Arrays.asList(empArr));
		Arrays.asList(empArr).forEach(e->{
			if(e!=null)
				empList.add(e);
		});
		Collections.sort(empList);
		
		empList.forEach(e ->{
			if(e !=null)
				System.out.println(e);
		});
		
		int[] data= {1,23,24,10,11,56,78,-80,-10};
		Arrays.stream(data).sorted().forEach(i ->{
				System.out.print(i+" ");
		});
		
//		System.out.println(empList);
		
//		System.out.println(emp1);
	}

}
