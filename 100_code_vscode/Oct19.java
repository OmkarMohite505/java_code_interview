import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Oct19{
    public static void main(String[] args) {
        Integer a = new Integer(127);
        Integer b = a + 0;
        System.out.println(a+" "+b+"  "+a.hashCode()+"  "+b.hashCode());
        System.out.println(a == b);
        a += 1;
        a -= 1;
        System.out.println(a+" "+b+"  "+a.hashCode()+"  "+b.hashCode());
        System.out.println(a==b);

        System.out.println();

        String s1 = "I";
        // Integer i = Integer.parseInt(s1);
        // Float f = i.intValue();
        // System.out.println(f);

        Set<String> clubMenebers = new HashSet<>(Arrays.asList("Betty","Muffin","Chuck","Steve"));
        Set<String> awardWinners = new HashSet<>(Arrays.asList("Betty","Chuck","Dora"));
        clubMenebers.retainAll(awardWinners);
        System.out.println(clubMenebers);
    }

}