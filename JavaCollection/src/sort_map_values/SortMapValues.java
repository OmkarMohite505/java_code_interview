package sort_map_values;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValues {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 3);
		map.put("B", 2);
		map.put("C", 1);
		map.entrySet().stream().sorted((e1,e2)->{
			return e1.getValue() - e2.getValue();
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue), )
		
	}

}
