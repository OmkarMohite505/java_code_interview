import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,1,23,9};

        for(int i = 0; i < arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j])
                    smallest = j;
            }
            if(smallest != i){
                arr[smallest] = arr[smallest] + arr[i];
                arr[i] = arr[smallest] - arr[i];
                arr[smallest] = arr[smallest] - arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
