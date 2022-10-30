import java.util.ArrayList;
import java.util.List;

public class Fortinet {
    public static void main(String[] args) {
        // Find the Longest Continious Alphabet Number Substring

        String str = "omkarxyzabcd";
        String longestString = String.valueOf(str.charAt(0));
        List<String> list = new ArrayList<>();
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
                int diff = (int) (ch - str.charAt(i - 1));
            if (diff == 1) {
                longestString += String.valueOf(ch);
                if(i == str.length() - 1){
                    list.add(longestString);
                }
            } else {
                list.add(longestString);
                longestString = String.valueOf(ch);
            }
        }
        int max = 0;
        longestString = "";
        for (String s : list) {
            if (s.length() > max){
                max = s.length();
                longestString = s;
            }
                
        }
        System.out.println(longestString);
    }
}
