package oct_6;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MaxScore {

	public static void main(String[] args) {
		int[] arr = { 7, 8, 9, 10, 5 };
		
		List<Integer> list = new ArrayList<Integer>();
		Arrays.stream(arr).forEach(e -> {
			list.add(e);
			
		});
	
		int operation = 0;
		int maxScore = 0;
		for (int i = 0; i < arr.length; i++) {
			if(operation % 2 == 0) {
				int max = list.get(0);
				for (Integer ele : list) {
					if (ele > max)
						max = ele;
				}
				maxScore += max;
				list.remove(new Integer(max));
				operation++;
			}
			else {
				int min = list.get(0);
				for(Integer ele:list) {
					if(ele < min)
						min = ele;
				}
				maxScore -= min;
				list.remove((Integer)min);
				operation++;
			}
			
			
		}
		System.out.println(maxScore);
	}

}
