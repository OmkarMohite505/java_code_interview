package oct15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Kshitija {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i< arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				if(j != i) {
					stack.push(arr[i]);
					stack.push(arr[j]);
				}
			}
		}
		List<Integer> listOfAddition = new ArrayList<>();
			for(int i=1; i<= 4; i++) {
				int a = stack.pop();
				int b = stack.pop();
				int c = stack.pop();
				int d = stack.pop();
				int res1 = a & b;
				int res2 = c & d;
				int result = res1 + res2;
				listOfAddition.add(result);
		}
		int max = listOfAddition.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
	}

}
