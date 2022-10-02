package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IntergerListSort {

	public static void main(String[] args) {
		int[] data = { 12, 3, 45, 123, -80, 90, 100 };
//		List<Integer> list = Arrays.stream(data).collect(Collectors.toList());
		List<Integer> list = Arrays.asList(1,5,3,2,2,8,6,8,9,44,3,46);
		List<Integer> list2 = Arrays.asList(data);
		System.out.println();
		Integer i = Integer.valueOf(0);
		Double d = Double.valueOf(5);
		
		List<Integer> list1 = new ArrayList<Integer>();
		Arrays.asList(data).stream().forEach(n -> list1.add(n));;
		Collections.sort(list1);
	}

}
