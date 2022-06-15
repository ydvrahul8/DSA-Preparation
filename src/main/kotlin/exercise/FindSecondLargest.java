package exercise;

public class FindSecondLargest {

    private static void getSecondLargest() {
        int[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int max1 = Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        if (data.length < 2) {
            return;
        }
        for (int i = 0; i < data.length; i++) {
            if (max1 < data[i]) {
                max2 = max1;
                max1 = data[i];
            } else if (data[i] > max2) {
                max2 = data[i];
            }

        }
        System.out.println(max2);
    }

    public static void main(String[] args) {
        getSecondLargest();
    }
}
