import java.util.Collections;
import java.util.HashSet;

public class ContinuouslyRepeatingChar {
    public static void main(String[] args) {
        String s = "coommon";
        String temp = "";
       System.out.println(firstRepeatingChar(s));
    }

    static char firstRepeatingChar(String s){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                return c;
            }
            else{
                set.add(c);
            }
        }
        
        return '\0';
    }
}