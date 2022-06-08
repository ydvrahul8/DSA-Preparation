package array;

import java.util.Arrays;

public class MyArray {

    private Object[] data;
    private int capacity;
    private int length;

    public MyArray() {
        capacity = 1;
        length = 0;
        data = new Object[1];
    }

    public Object get(int index) {
        return data[index];
    }

    public void push(Object obj) {
        if (capacity == length) {
            data = Arrays.copyOf(data, capacity * 2);
            capacity *= 2;
        }
        data[length] = obj;
        length++;
    }

    public Object pop() {
        Object popped = data[length - 1];
        data[length - 1] = null;
        length--;
        return popped;
    }

    public Object delete(int index) {
        Object itemToDelete = data[index];
        shiftItems(index);
        return itemToDelete;
    }

    public void shiftItems(int index) {
        for (int i = 0; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[length - 1] = null;
        length--;
    }

    public static void main(String args[]){
        MyArray m = new MyArray();
        m.push("Hellow");
        m.push("world");
        for(int i=0;i< m.length;i++){
            System.out.println(m.get(i));
        }
    }

}
