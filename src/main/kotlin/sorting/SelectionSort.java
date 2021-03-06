package sorting;

import java.util.Arrays;

public class SelectionSort {

    private static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 12, 43, 12, 54, 2, 1, 0};
        sort(arr);
    }

}
