import java.util.Arrays;

public class Test4 {

        public static void main(String[] args) { int arr[] = new int[5];
        
        arr[0] = 6; arr[1] = Integer.parseInt("1");
        
        arr[2] = 2; arr[3] = 3;
        
        arr[4] = -4;
        
        Arrays.fill(arr, 1, 4, 5); for (int i = 0; i < 5; i++)
        
        System.out.print(arr[i]);
}
}
