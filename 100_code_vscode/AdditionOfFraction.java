public class AdditionOfFraction {
    public static void main(String[] args) {
        int num1 = 1, den1 = 3, num2 = 3, den2 = 9;
        int num = 0, den = 0, x = 0;
        if (den1 == den2) {
            num = num1 + num2;
            den = den1;
        } else {
            num = (num1 * den2) + (den1 * num2);
            den = den1 * den2;
        }
        if(num > den)
            x = num;
        else
            x = den;
        for(int i = 0; i <= x; i++){
            if(num % i == 0 && den % i == 0){
                num = num / i;
                den = den / i;
            }
        }
        // logic for getting simplified fraction
        int n = 1;
        if(num != den){
            while(n != 0){
                
            }
        }
    }
}
