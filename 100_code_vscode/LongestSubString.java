import java.util.ArrayList;
import java.util.List;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "omkarxyzabcd";
        System.out.println(longestString(str));
    }

    private static String longestString(String str) {
        String longesString = String.valueOf(str.charAt(0));
        List<String> list = new ArrayList<>();
        for(int i=1; i < str.length();i++){
            char ch = str.charAt(i);
            int diff = ch - str.charAt(i-1);
            if(diff == 1){
                longesString += String.valueOf(str.charAt(i));
                if(i == str.length() - 1){
                    list.add(longesString);
                }
            }
            else{
                list.add(longesString);
                longesString = String.valueOf(str.charAt(i));
            }
        }
        int max = 0;
        for(String s: list){
            if(s.length() > max){
                longesString = s;
            }
        }
        return longesString;
    }
}
