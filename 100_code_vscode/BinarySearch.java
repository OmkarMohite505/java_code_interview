public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,8,9};
        binarySearch(arr, 3);

    }
    public static void binarySearch(int [] arr, int key){
        int low = 0;
        int high = arr.length-1;
       
        while(low <= high){
            int mid = (low+ high)/2;
            if(arr[mid] == key){
                System.out.println("Key Found at "+(mid+1)+" Index");
                break;
            }
            if(key < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
    }
}
