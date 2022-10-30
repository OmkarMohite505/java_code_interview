public class ThirdHighestNumber {
    // Find Third Highest Number in Array
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 67, 45, 23, 68, 101 };
        int max1, max2, max3;
        max1 = max2 = max3 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            if(arr[i] > max3 && arr[i] < max1){
                max3 = max2;
                max2 = arr[i];
            }
            if(arr[i] > max3 && arr[i] < max2){
                max3 = arr[i];
            }
            
        }
        System.out.println("Third Highest Number is "+max3);
    }
}
