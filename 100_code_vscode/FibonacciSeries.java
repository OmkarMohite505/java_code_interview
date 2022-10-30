public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        while(num3 >= 10){
            System.out.print(num1+" ");
            num1 = num2;
            num3 = num1 + num2;
        }
    }
}
