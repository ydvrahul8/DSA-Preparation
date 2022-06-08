package stack_queue;

import java.util.Arrays;

public class MyStack {

    private int length;
    private Object[] data;

    public MyStack(int size) {
        this.length = 0;
        data = new Object[size];
    }

    private void push(Object value) {
        if (isFull())
            return;
        data[length++] = value;
    }

    private void pop() {
        if (isEmpty())
            return;
        data[--length] = null;
    }

    private Object peek() {
        if (isEmpty())
            return "No Data present";
        else
            return data[length - 1];
    }

    private Boolean isEmpty() {
        return length == 0;
    }

    private Boolean isFull() {
        return data.length == length;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        System.out.println(Arrays.toString(stack.data));
        stack.push("data0");
        stack.push("data1");
        stack.push("data2");
        stack.push("data3");
        stack.push("data4");
        System.out.println(Arrays.toString(stack.data));
        stack.pop();
        stack.pop();
        System.out.println(Arrays.toString(stack.data));
        System.out.println("Data on top stack is " + stack.peek());
    }

}
