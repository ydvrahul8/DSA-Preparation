package array;

public class HigherArray {

    private int[] data;
    int size;

    public HigherArray(int size) {

        data = new int[size];
        size = 0;
    }

    public void insert(int number) {
        data[size] = number;
        size++;
    }

    public int size(int number) {
        return size;
    }

    public boolean find(int number) {
        for (int i = 0; i < size; i++) {
            if (data[i] == number)
                return true;
        }
        return false;
    }

    public boolean delete(int number) {
        int index;
        for (index = 0; index < size; index++) {
            if (data[index] == number)
                break;
        }

        if (index == size) {
            System.out.println("Element Not found into the array.");
            return false;
        } else {
            for (int j = index; j < size; j++) {
                data[j] = data[j + 1];
            }
            size--;
            return true;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
