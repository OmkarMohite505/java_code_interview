package basic;

import java.util.Arrays;

public class CompareString {

	public static void main(String[] args) {
		String[] names= {"Mihir","Nikhil","Meetali","Rohan","Mahesh","Ravi","Mihir"};
		System.out.println(names[0].compareTo(names[2]));// >0 
		System.out.println(names[1].compareTo(names[2])); // > 0
		System.out.println(names[0].compareTo(names[4]));// > 0
		System.out.println(names[5].compareTo(names[3]));//<0
		System.out.println(names[0].compareTo(names[6]));//0
		
		String s2="Mihir, Nikhil,Meetali,Rohan,Mahesh,Ravi";
		System.out.println(Arrays.toString(s2.split(",")));
		
		String str = " ";
		String test = " om ";
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(str.length());
		System.out.println(test.trim());
		
	}

}
