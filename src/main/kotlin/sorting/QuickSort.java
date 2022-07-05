package sorting;

import java.util.Arrays;

public class QuickSort {

    private static int getPivotIndex(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {

                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = getPivotIndex(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex + 1, high);

        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 12, 43, 12, 54, 2, 1, 0};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

}
