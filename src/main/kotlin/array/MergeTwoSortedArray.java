package array;


import java.util.Arrays;

/**
 * Write a program where we will pass two sorted array, and in the output expect one single sorted array.
 * Eg. input -> array1 = {1,2,5,7}, array2 = {3,4,6}
 */
public class MergeTwoSortedArray {

    public static void mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int array1Index = 0;
        int array2Index = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if ((array2Index != array2.length) && (array1Index == array1.length || (array1[array1Index] > array2[array2Index]))) {
                mergedArray[i] = array2[array2Index];
                array2Index++;
            } else {
                mergedArray[i] = array1[array1Index];
                array1Index++;
            }
        }
        Arrays.stream(mergedArray).forEach(System.out::println);
    }

    public static void main(String[] args) {
        mergeArrays(new int[]{1, 2, 5}, new int[]{3, 4, 6,7});
    }
}
