import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CovertArrayToList {

	public static void main(String[] args) {
		String[] colors = {"Red","Green","Blue"};
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, colors);
		list.forEach(System.out::println);
		Integer[] arr = {1,2,3,45,6};
		List<Integer> li = new ArrayList<Integer>();
		Collections.addAll(li, arr);
		
		
		
		
		System.out.println(Arrays.toString(arr));
	}

}
