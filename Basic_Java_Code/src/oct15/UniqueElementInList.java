package oct15;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueElementInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,10,2,2,2,2);
		Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		list.stream().forEach(ele->{
			if(map.containsKey(ele)) {
				map.put(ele, map.get(ele)+1);
			}else {
				map.put(ele, 1);
			}
		});
		System.out.println("Unique Element: "+set);
		System.out.println(map.values());
		System.out.println(map.keySet());
		Set<Integer> key = map.keySet();
		Collection<Integer> value = map.values();
		
	}

}
