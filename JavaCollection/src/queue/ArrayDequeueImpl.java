package queue;

import java.util.ArrayDeque;

public class ArrayDequeueImpl {

	public static void main(String[] args) {
		int lengthOfQueue = 1;
		ArrayDeque<Character> dequeue = new ArrayDeque<>(1);
		String str = "EELELEE";
		int blinkRedBulb = 0;
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 'E') {
				if(dequeue.size()==lengthOfQueue)
					blinkRedBulb++;
				else {
					dequeue.add(str.charAt(i));
					System.out.println(dequeue);
				}
					
			}
			else {
				dequeue.remove();
			}
		}
		System.out.println();
//		System.out.println(dequeue.size());
		System.out.println(dequeue);
		System.out.println(blinkRedBulb);
	}

}
