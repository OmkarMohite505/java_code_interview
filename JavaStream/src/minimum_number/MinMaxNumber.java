package minimum_number;

import java.util.Arrays;
import java.util.List;

public class MinMaxNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,32,-5,45,2,5,3,12,40);
		int min = list.stream().min((x, y) -> x - y).get();
		System.out.println(min);
		int max = list.stream().max((x,y) -> x - y).get();
		System.out.println(max);
		long count = list.stream().count();
		System.out.println(count);
	}

}
