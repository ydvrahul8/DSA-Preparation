package stack_queue;

import java.util.Arrays;

public class MyCircularQueue {

    int size = 0;
    int front = -1;
    int rear = -1;
    Object[] items;

    public MyCircularQueue(int size) {
        this.size = size;
        items = new Object[size];
    }

    public int getRearIndex() {
        return (rear + 1) % size;
    }

    public boolean isFull() {
        return getRearIndex() == front;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public void enqueue(Object value) {
        if (isFull())
            return;
        if (front == -1)
            front++;
        rear = getRearIndex();
        items[rear] = value;
    }

    public void dequeue() {
        if (isEmpty())
            return;
        if (rear == front)
            rear = front = -1;
        else {
            items[front] = null;
            front = (front + 1) % size;
        }
    }

    public static void main(String[] args) {

        MyCircularQueue queue = new MyCircularQueue(4);
        queue.enqueue("queue0");
        queue.enqueue("queue1");
        queue.enqueue("queue2");
        queue.enqueue("queue3");
        System.out.println(Arrays.toString(queue.items));
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(Arrays.toString(queue.items));
        queue.enqueue("queue4");
        System.out.println(Arrays.toString(queue.items));

    }
}
