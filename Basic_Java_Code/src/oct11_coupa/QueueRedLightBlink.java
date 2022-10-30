package oct11_coupa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueRedLightBlink {

	public static void main(String[] args) {
		//Method giving arguments string and length of Queue
		String str = "EELLE";
		int lengthOfQueue = 1;
		int cnt = 0;
		//E Data packet received  --> enque
		// L Data packet leave from the queue  --> dequeue
		//If the queue is full in that case red light will blink and we need to find out how many times this red light will blink 
		Queue<Character> queue = new ArrayDeque<Character>(1);
		for(int i=0; i<str.length(); i++) {
			
			try {
				queue.add(str.charAt(i));
			}
			catch(IllegalStateException e) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
