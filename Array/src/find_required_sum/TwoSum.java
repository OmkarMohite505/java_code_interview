package find_required_sum;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = {2,3,7,4,8};
		// result of two sum no is 7 required,
		// so return index of that no
		boolean flag = false;
		int a=-1,b=-1;
		for(int i=0; i< arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if((arr[i]+arr[j]) == 7) {
					System.out.println("Got");
					flag = true;
					a = i; b = j;
					break;
				}
			}
			if(flag == true)
				break;
		}
		System.out.println(a+" "+b);
	}

}
