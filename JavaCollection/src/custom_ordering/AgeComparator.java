package custom_ordering;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		//Ascending order
//		if(e1.getAge() > e2.getAge())
//			return 1;
//		if(e1.getAge() < e2.getAge())
//			return -1;
//		return 0;
		
		// Descending order
		if(e1.getAge() > e2.getAge())
			return -1;
		if(e1.getAge() < e2.getAge())
			return 1;
		return 0;
		
	}
}
