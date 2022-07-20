package array;

import java.util.Arrays;

public class OrderedArray {

    int[] data;
    int size;

    public OrderedArray(int length) {
        data = new int[length];
        size = 0;
    }

    public void insert(int number) {
        int j;
        for (j = 0; j < size; j++) {
            if (data[j] > number)
                break;
        }

        for (int k = size; k > j; k--) {
            data[k] = data[k - 1];
        }

        data[j] = number;
        size++;
    }

    public void find(int[] data, int sIndex, int eIndex, int item) {
        if (sIndex > eIndex) {
            System.out.println("Element not found");
            return;
        }
        int mid = sIndex + ((eIndex - sIndex) / 2);
        if (data[mid] == item)
            System.out.println("Element found at " + mid);
        else if (data[mid] > item) {
            find(data, sIndex, mid, item);
        } else
            find(data, mid + 1, eIndex, item);
    }

    public void delete(int number) {
        int j;
        for (j = 0; j < size; j++) {
            if (data[j] == number)
                break;
        }
        if (j == size)
            System.out.println("Element Does not exist");
        else {
            for (int i = j; i < size; i++) {
                data[i] = data[i + 1];
            }
            size--;
            System.out.println("Element Deleted");
            System.out.println(Arrays.toString(data));
        }
    }

    public static void main(String[] args) {
        OrderedArray array = new OrderedArray(100);
        array.insert(20);
        array.insert(22);
        array.insert(24);
        array.insert(4);
        array.insert(14);
        array.insert(5);
        System.out.println(Arrays.toString(array.data));
        array.find(array.data, 0, array.size, 50);
        array.delete(34);
    }

}
