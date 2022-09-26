package average_marks;

import java.util.Scanner;

public class CalculateSubjectAverageMarks {

	public static void main(String[] args) {
		int total, n;
		float average;
		System.out.println("ENter total subjects");
		n = new Scanner(System.in).nextInt();
		System.out.println("Enter total marks you got");
		total = new Scanner(System.in).nextInt();
		average = (float)total/n;
		System.out.println(average);
		
	}

}
