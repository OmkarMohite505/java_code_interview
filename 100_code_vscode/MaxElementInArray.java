public class MaxElementInArray {
    public static void main(String[] args) {
        int arr[] = {99,789,43,5,53,10};
        int max= arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum element is : "+max);
        System.out.println(System.getProperty("user.dir"));
    }
}
