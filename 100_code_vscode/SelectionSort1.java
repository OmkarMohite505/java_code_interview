import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {6,3,2,5,1};
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i= 0; i < arr.length - 1;i++){
            int smallest = i;
            for(int j = i; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            if(smallest != i){
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
           
        }
    }
}
