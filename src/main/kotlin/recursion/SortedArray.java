package recursion;

public class SortedArray {
    public static boolean checkArray(int arr[], int index) {
        if (index == arr.length - 1)
            return true;
        if (arr[index] < arr[index + 1])
            return checkArray(arr, ++index);
        else return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3};
        System.out.println(checkArray(arr, 0));
    }
}
