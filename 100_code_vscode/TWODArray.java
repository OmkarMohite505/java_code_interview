import java.util.Scanner;

public class TWODArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2D Array");
        int[][] arr = new int[2][2];
        int [][] arr2 = {{1,2},{3,4}};
        for(int i=0;i<2;i++){
            System.out.println("Enter "+(i+1)+" row Data");
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
