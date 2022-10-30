public class OccurenceOfDigitInNumber {
    public static void main(String[] args) {
        int num = 88998;
        int occurence = 8;
        int count = 0;
        while(num > 0){
            if(num % 10 == occurence)
                count++;
            num /= 10;
        }
        System.out.println(count);
        num = 88998;
        // By string method
        int cnt = 0;
        String str = Integer.toString(num);
        char occrr = '9';
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == occrr)
                cnt++;
        }
        System.out.println(cnt);
    }
}
