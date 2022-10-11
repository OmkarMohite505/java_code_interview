package oct_6;
public class OddNoCountInTwoArray {

	public static void main(String[] args) {
		int n[] = {2,2,2,2,2};
		int m[] = {2,3,4};
		int count = 0;
		for(int i=0; i<n.length; i++) {
			for(int j=0; j< m.length; j++) {
				if((n[i]+ m[j]) % 2 == 1) {
					count++;
				}
			}
		}
		System.out.println("No of Ways to get sum odd : "+count);
	}

}
