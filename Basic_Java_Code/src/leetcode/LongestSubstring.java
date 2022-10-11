package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubString("abcbbcabcd"));
		System.out.println(lengthOfLongestSubstring("abcbbcabcd"));

	}

	public static int lengthOfLongestSubString(String s) {
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			StringBuilder currentSubString = new StringBuilder();
			for (int j = i; j < s.length(); j++) {
				if (currentSubString.indexOf(String.valueOf(s.charAt(j))) != -1) {
					break;
				}
				currentSubString.append(s.charAt(j));
				maxLength = Math.max(maxLength, currentSubString.length());
			}
		}
		return maxLength;

	}

	public static int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		Map<Character, Integer> visitedCharacter = new HashMap<Character, Integer>();
		for (int right = 0, left = 0; right < s.length(); right++) {
			char currentCharacter = s.charAt(right);
			if (visitedCharacter.containsKey(currentCharacter) && visitedCharacter.get(currentCharacter) >= left) {
				left = visitedCharacter.get(currentCharacter) + 1;
			}
			maxLength = Math.max(maxLength, right - left + 1);
			visitedCharacter.put(currentCharacter, right);
		}
		return maxLength;
	}
}
