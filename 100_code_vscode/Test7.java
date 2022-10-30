public class Test7 {
    public static void main(String[] args) {
        System.out.println(findDigit(12, 4));
    }
    static int findDigit(int A, int B){
        int result = A * B;
        String str = String.valueOf(result);

        return str.length();
    }
}
