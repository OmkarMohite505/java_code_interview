package count_frequency_of_char;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfChar {
	public static void main(String[] args) {
		String str = "HelloH";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i< str.length();i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		map.entrySet().stream().forEach(System.out::println);
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}
