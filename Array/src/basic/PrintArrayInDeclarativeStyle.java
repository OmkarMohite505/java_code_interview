package basic;

import java.util.Arrays;
import java.util.List;

public class PrintArrayInDeclarativeStyle {

	public static void main(String[] args) {
		int [] arr = {1,2,5,4,7,8,11,20};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
//		List<int[]> list = Arrays.asList(arr);
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
//		list.forEach(System.out::println);
//		list.forEach(e-> System.out.println(e));
//		list.stream().forEach(System.out::println);
	}

}
