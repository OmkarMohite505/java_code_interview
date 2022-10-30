import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 152,2, 5, 8, 3, 9 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // int temp = arr[j+1];
                    // arr[j+1] = arr[j];
                    // arr[j] = temp;
                    arr[j + 1] = arr[j + 1] + arr[j];
                    arr[j] = arr[j + 1] - arr[j];
                    arr[j + 1] = arr[j + 1] - arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("End");
    }
}
