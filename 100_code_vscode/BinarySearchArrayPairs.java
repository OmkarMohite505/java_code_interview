public class BinarySearchArrayPairs {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {1,2};
        int k = 4;
        int pairs = 0;
        for(int i=0; i < arr1.length; i++){
            for(int j=0; j < arr2.length; j++){
                if((arr1[i] + arr2[j]) < k){
                    pairs++;
                }
            }
        }

        System.out.println("Total Pairs : "+pairs);
    }
}
