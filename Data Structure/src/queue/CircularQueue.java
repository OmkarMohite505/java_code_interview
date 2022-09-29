package queue;

public class CircularQueue<T> {
	private T[] arr;
	private int front, rear, size;

	public CircularQueue(int size) {
		arr = (T[]) new Object[size];
		front = rear = -1;
		this.size = size;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return (front == -1 && rear == (size - 1)) || ((rear + 1) % size == front);
	}

	public boolean insert(T data) {
		if (isFull())
			return false;
		rear = (rear + 1) % size;
		arr[rear] = data;
		return true;
	}

	public T delete() {
		if (isEmpty())
			return null;
		front = (front + 1) % size;
		return arr[front];
	}

}
