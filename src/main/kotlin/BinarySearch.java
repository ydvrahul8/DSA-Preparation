public class BinarySearch {

    public static boolean binarySearch(int[] data, int item) {

        int eIndex = data.length;
        int sIndex = 0;

        do {
            int mid = sIndex + ((eIndex - sIndex) / 2);
            if (data[mid] == item) {
                System.out.println("Element Found at" + mid);
                return true;
            } else if (item > data[mid]) {
                sIndex = mid + 1;
            } else {
                eIndex = mid;
            }
        } while (sIndex < eIndex);
        return false;
    }

    public static void binarySearchR(int[] data, int sIndex, int eIndex, int item) {
        if (sIndex > eIndex) {
            System.out.println("Element not found");
            return;
        }
        int mid = sIndex + ((eIndex - sIndex) / 2);
        if (data[mid] == item)
            System.out.println("Element found at " + mid);
        else if (data[mid] > item) {
            binarySearchR(data, sIndex, mid, item);
        } else
            binarySearchR(data, mid + 1, eIndex, item);
    }

    public static void main(String[] args) {

        int[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

//        System.out.println(binarySearch(list, 91));

        binarySearchR(list,0,list.length-1,95);
    }

}
