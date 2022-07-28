package exercise;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 3, 2, 23, 0, 7};

        // System.out.println(Arrays.toString(reverseArray(arr)));
        reverseArrayR(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] reverseArray(int[] arr) {

        int length = arr.length;
        if (length <= 1)
            return arr;

        int s = 0;
        int e = length - 1;

        for (int i = 0; i < length / 2; i++) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        return arr;
    }

    private static void reverseArrayR(int[] arr, int s, int e) {

        if (s >= e)
            return;
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverseArrayR(arr, s + 1, e - 1);
    }

}
