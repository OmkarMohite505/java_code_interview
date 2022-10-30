public class BinaryToDecimal {
    public static void main(String[] args) {
        int decimal = 9;
        //integer array for sorting binary digits
        int binary[] = new int[20];
        int i = 0;
        while(decimal > 0){
            int r = decimal % 2;
            binary[i++] = r;
            decimal /= 2;
        }
        // printing binary no
        for(int j = i-1;j>=0; j--){
            System.out.print(binary[j]);
        }

    }
}
