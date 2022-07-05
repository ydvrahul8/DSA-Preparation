package exercise;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Function to move all zeros present in the array to the end
    public static void partition(int[] A) {
        int j = 0;

        // each time we encounter a non-zero, `j` is incremented, and
        // the element is placed before the pivot
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0)        // pivot is 0
            {
                swap(A, i, j);
                j++;
            }
        }

        System.out.println(Arrays.toString(A));
    }

    public static void main(String[] args) {
        int[] A = {6, 0, 8, 2, 3, 0, 4, 0, 1};

        System.out.println(Arrays.toString(A));
        partition(A);
    }


}
