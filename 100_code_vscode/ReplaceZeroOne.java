public class ReplaceZeroOne {
    public static void main(String[] args) {
        int num = 120014;
        String str = Integer.toString(num);
        // String str1 = String.valueOf(num);
        int length = str.length();
        String str1 = "";
        for(int i = 0; i< length; i++){
            if(str.charAt(i) == '0')
                str1 += "1";
            else
                str1 += str.charAt(i);
        }

        num = Integer.valueOf(str1);
        System.out.println(num);

    }   
}
