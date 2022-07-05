package sorting;

import java.util.Arrays;

public class InsertionSort {

    private static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 12, 43, 12, 54, 2, 1, 0};
        sort(arr);
    }

}
