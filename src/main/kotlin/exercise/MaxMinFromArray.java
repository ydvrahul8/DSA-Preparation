package exercise;

import java.util.Arrays;

public class MaxMinFromArray {

    static class Pair {
        int max;
        int min;
    }

    public static void main(String[] args) {
        int[] number = {23, 11, 32, 12, 21, 7, 99, 87, 20};

//        Pair pair = getMaxAndMin(number);
        Pair pair = getMaxAndMinRecursive(number, 0, number.length-1);
        System.out.println("Array is " + Arrays.toString(number));
        System.out.println("Maximum number is " + pair.max + "minimum number is " + pair.min);
    }

    private static Pair getMaxAndMin(int[] number) {
        Pair minMax = new Pair();
        if (number.length == 0) {
            return minMax;
        }

        minMax.max = number[0];
        minMax.min = number[0];

        for (int i = 1; i < number.length; i++) {
            if (minMax.max <= number[i]) {
                minMax.max = number[i];
            } else if (minMax.min >= number[i]) {
                minMax.min = number[i];
            }
        }
        return minMax;
    }

    /**
     * Find max and min with the help of divide and conquer.
     * here we will divide the array into two half and find the max and min of it.
     * And to do that we will recursion.
     */

    private static Pair getMaxAndMinRecursive(int[] number, int s, int e) {

        Pair minMax = new Pair();

        if (e == s) {
            minMax.min = number[s];
            minMax.max = number[s];
            return minMax;
        }

        if (e == s + 1) {
            if (number[e] > number[s]) {
                minMax.min = number[s];
                minMax.max = number[e];
            } else {
                minMax.max = number[s];
                minMax.min = number[e];
            }
            return minMax;
        }

        int mid = (s + e) / 2;

        Pair leftSide = getMaxAndMinRecursive(number, s, mid);
        Pair rightSide = getMaxAndMinRecursive(number, mid + 1, e);

        minMax.min = Math.min(leftSide.min, rightSide.min);
        minMax.max = Math.max(leftSide.max, rightSide.max);

        return minMax;
    }
}
