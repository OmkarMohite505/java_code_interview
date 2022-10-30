import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {6,3,2,5,1};
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for(int i= 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}