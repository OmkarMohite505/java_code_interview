package queue;

public class Queue<T> {
	private T arr[];
	private int front, rear;
	private int size;

	public Queue(int size) {
		arr = (T[]) new Object[size];
		front = rear = -1;
		this.size = size;
	}

	public boolean isEmpty() {
		return (front == -1 && rear == -1) || (front > rear);
	}
	
	public boolean isFull() {
		return rear == (size -1);
	}
	
	public boolean insert(T data) {
		if(isFull())
			return false;
		arr[++rear] = data;
		if(front == -1)
			front = 0;
		return true;
	}
	
	public T delete() {
		if(isEmpty())
			return null;
		return arr[front++];
	}
}
