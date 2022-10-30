import java.util.Arrays;

public class InsertionSort1 {
    public static void main(String[] args) {
        int[] arr = {6,3,2,5,1};
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i= 0; i < arr.length; i++){
            int key = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
}
