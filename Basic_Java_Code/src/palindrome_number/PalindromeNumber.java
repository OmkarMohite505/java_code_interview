package palindrome_number;

import java.util.Stack;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 1511;
		int cnt = 0;
		Stack<Integer> stack = new Stack<>();
		while (num > 0) {
			cnt++;
			stack.push(num % 10);
			num = num / 10;
		}
		System.out.println(stack.size());
		System.out.println();
		int n = stack.size();
		for (int i = 1; i <= n; i++) {
			System.out.print(stack.pop());
		}
			
		System.out.println();
		System.out.println(stack.size());
		System.out.println(cnt);
	}
}
