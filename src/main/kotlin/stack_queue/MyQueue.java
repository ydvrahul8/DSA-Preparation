package stack_queue;

import java.util.LinkedList;

/**
 * queue is where what comes first goes first
 * eg. 1,2,3,4,5,6
 * so if we want to remove element from the queue than it will return 1.
 * so if we do it with the help of array than we have to move all the remaining data to first.
 * which not efficient way to do it.
 * The other way is to use linked list, where you can just change the head of the queue and its done.
 * By using queue we don't need to shift the entire data.
 */

public class MyQueue {

    private LinkedList<Object> list = new LinkedList<Object>();

    private void enqueue(Object value) {
        list.add(value);
    }

    private void dequeue() {
        list.removeFirst();
    }

    private Object peek() {
        return list.getFirst();
    }

    private int length() {
        return list.size();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("queue0");
        queue.enqueue("queue1");
        queue.enqueue("queue2");
        queue.enqueue("queue3");
        System.out.println(queue.list);
        queue.dequeue();
        System.out.println(queue.list);
        System.out.println(queue.length());
    }
}
