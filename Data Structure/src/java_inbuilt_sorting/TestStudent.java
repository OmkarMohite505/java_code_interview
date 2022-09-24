package java_inbuilt_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(89, 25, "omkar");
		Student s2 = new Student(3, 20, "ram");
		Student s3 = new Student(10, 19, "laxman");
		Student s4 = new Student(7, 22, "akshay");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list);
		list.forEach(s -> System.out.println(s));
	}

}
