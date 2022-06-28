package sorting;

import java.util.Arrays;

public class BubbleSort {

    private static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * This is the optimised bubble sort where the given array is already sorted.
     * So if user have given a sorted array than it will check and if swapped variable is already false then it will
     * break the for loop and return and say the array is already sorted.
     */
    public static void sort2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 12, 43, 12, 54, 2, 1, 0};
        int arr2[] = {0, 1, 2, 2, 3, 12, 12, 43, 54};
        sort(arr);
        sort(arr2);
    }

}
