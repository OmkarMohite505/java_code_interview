public class LongestSerialSubstring {
    public static void main(String[] args) {
        String str = "omkarxyzabcd";
        String max1 = "";
        String max2 = "";

        for(int i = 0; i < str.length(); i++){
            char ch1 = str.charAt(i);
            if(i == 0){
                max2 = String.valueOf(ch1);
                continue;
            }
            if(i != 0){
                int diff = ch1 - max2.charAt(max2.length() - 1);
                if(diff == 1){
                    max2 += String.valueOf(ch1);
                }else{
                    if(max2.length() > max1.length() && diff == 0){
                        max1 = max2;
                        max2 = String.valueOf(max2.charAt(max2.length() - 1));
                    }
                }
            }
            if(i == str.length() - 1){
                if(max2.length() > max1.length()){
                    max1 = max2;
                }
            }
        }

        System.out.println("Longest Serial Substring = "+max1);
    }
}
