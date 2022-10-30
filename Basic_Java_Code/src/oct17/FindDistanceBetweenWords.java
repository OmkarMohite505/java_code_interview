package oct17;

public class FindDistanceBetweenWords {

	public static void main(String[] args) {
		String sentence = "use cloudtech for learning java";
		String word1 = "cloudtech";
		String word2 = "for";
		System.out.println(findDistance(sentence, word1, word2));
	}

	private static int findDistance(String sentence, String word1, String word2) {
		String arr[] = sentence.split(" ");
		int start, end, diff, itrBreak;
		start = end = diff = itrBreak = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(word1)) {
				start = i + 1;
				itrBreak++;
			}
			if (arr[i].equals(word2)) {
				end = i + 1;
				itrBreak++;
			}
			if (itrBreak == 2)
				break;
		}
		if (end > start)
			return end - start - 1;
		else
			return start - end - 1;
	}

}
