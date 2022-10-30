public class CountSpecialChar {
    public static void main(String[] args) {
        String s = "!om#ksj$!aksk@";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                continue;
            }
            result++;

        }
        return result;
    }
}
