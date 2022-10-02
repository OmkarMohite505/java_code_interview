package find_frequency_of_ele;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfElementInArray {
	public static void countFreq(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			// First of all we need to check whether these elements exist in the map or not
			// if Element not exist in the map then we will insert this element in the map
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		
		map.keySet().stream().forEach(e -> System.out.print(e+" "));
		System.out.println();
		map.values().stream().forEach(e -> System.out.print(e+"  "));
		System.out.println();
		map.entrySet().stream().forEach(e-> System.out.println(e));
	}

	public static void main(String[] args) {
		int arr[] = { 10, 10, 20, 30, 30, 5, 1, 1 };
		countFreq(arr);
	}

}
