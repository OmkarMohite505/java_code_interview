import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubstring {
    // Longest Non Repeating SubString
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        Set<Character> set = new HashSet<>();
        String max1 = "";
        String longestString = "";

        for(int i=0; i < str.length(); i++){
            if(longestString.contains(String.valueOf(str.charAt(i)))){
                if(longestString.length() > max1.length()){
                    max1 = longestString;
                }
                longestString = String.valueOf(str.charAt(i));
                if(i == str.length() - 1){
                    if(longestString.length() > max1.length()){
                        max1 = longestString;
                    }
                }
            }else{
                longestString += String.valueOf(str.charAt(i));
            }
        }
        System.out.println("Longest Substring "+max1);
    }
}
