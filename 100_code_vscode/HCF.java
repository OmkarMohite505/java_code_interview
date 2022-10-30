class HCFOfNumber {
    public static void main(String[] args) {
        int hcf = 1;
        int num1 = 24, num2 = 48, num3 = 72;

        for (int i = 1; i <= num1/2 || i <= num2/2 || i <= num3/2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }
        System.out.println("HCF is : "+hcf);
    }
}