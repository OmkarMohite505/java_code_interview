package oct15;

public class Rushi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainStr = "aaabcccabbaa";
		System.out.println(minLength(mainStr));


	}
	static int minLength(String s)
    {
        int i = 0, j = s.length() - 1;
        for (; i < j
               && s.charAt(i) == s.charAt(j);) {
            char d = s.charAt(i);
            while (i <= j	
                   && s.charAt(i) == d)
                i++;
            while (i <= j
                   && s.charAt(j) == d)
                j--;
        }
        return j - i + 1;
    }

}
