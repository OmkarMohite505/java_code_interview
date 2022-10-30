import java.util.Arrays;

public class ReplaceSpacesInString {
    public static void main(String[] args) {
        String str = "india   is my      country";
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.replaceAll("\\s", ","));
    }
}
