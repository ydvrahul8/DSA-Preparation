package sorting;

import java.util.Arrays;

public class InsertionSort {

    private static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int element = arr[i];
            while (j >= 0 && element < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = element;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] data = {9, 5, 1, 4, 3};
        sort(data);
    }

}
