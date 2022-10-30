import java.util.ArrayList;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,7,6,10,32,9};
        System.out.println(avg(arr));
    }
    static int avg(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < arr.length; i++){
            boolean flag = isPowerOfTwo(arr[i]);
            if(!flag){
                list.add(arr[i]);
            }
            if(arr[i] == 1 || arr[i] == 0){
                list.add(arr[i]);
            }
        }
        int sum = 0;
        for(Integer i:list){
            sum += i;
        }
        int avg = sum /list.size();
        return avg;
    }
    static boolean isPowerOfTwo(int n)
    {
        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
}
