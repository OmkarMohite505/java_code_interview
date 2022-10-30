public class PowerOfNumber {
    public static void main(String[] args) {
        // 2^4 => 16
        // 2*2*2*2
        int base = 3;
        int power = 4;
        int result = 1;
        while(power > 0){
            result *= base;
            power--;
        }
        System.out.println("Power is = "+result);
    }
}
