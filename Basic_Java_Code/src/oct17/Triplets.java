package oct17;

public class Triplets {

	public static void main(String[] args) {
		int arr[] = {2,5,3,1,4,9};
		int n = arr.length;
		System.out.println(maximumTripletSum(arr, n));
	}

	private static int maximumTripletSum(int[] arr, int n) {
		int ans = 0;
		for(int i=0; i<n-1;i++) {
			int max1 = 0, max2 = 0;
			for(int j=0;j<i;j++) {
				if(arr[j] < arr[i])
					max1 = Math.max(max1, arr[j]);
			}
			for(int j = i+1; j<n;j++) {
				if(arr[j] > arr[i])
					max2 = Math.max(max2, arr[j]);
			}
			if(max1 > 0 && max2 > 0) {
				ans = Math.max(ans, max1+max2+arr[i]);
			}
		}
		
		return ans;
	}

}
