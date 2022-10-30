import java.util.Arrays;

class SimpleQueue{
    int front, rear, size;
    int[] arr;
    public SimpleQueue(int size){
        arr = new int[size];
        this.size = size;
        front = rear = -1;
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return rear == size - 1;
    }
    public boolean insert(int data){
        if(isFull()){
            return false;
        }
        arr[++rear] = data;
        return true;
    }
    public int delete(){
        if(isEmpty() && front <= rear){
            return -999;
        }
        return arr[++front];
    }
}

public class Queue {
    public static void main(String[] args) {
        SimpleQueue sq = new SimpleQueue(5);
        sq.insert(1);
        sq.insert(2);
        sq.insert(3);
        sq.insert(4);
        sq.insert(5);
        System.out.println(Arrays.toString(sq.arr));
    }
}
