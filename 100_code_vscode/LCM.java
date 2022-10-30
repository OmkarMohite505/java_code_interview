public class LCM {
    public static void main(String[] args) {
        int num1 = 20, num2 = 41, lcm = 0;
        int max = (num1 > num2) ? num1 : num2;
        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("LCM is : " + lcm);

        int n1 = 31, n2 = 33, n3 = 30, lcm2 = 0;
        int maximum = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        // System.out.println(maximum);
        for (int i = maximum; i <= n1 * n2 * n3; i++) {
            if (i % n1 == 0 && i % n2 == 0 && i % n3 == 0) {
                lcm2 = i;
                break;
            }
        }
        System.out.println(lcm2);
    }
}
