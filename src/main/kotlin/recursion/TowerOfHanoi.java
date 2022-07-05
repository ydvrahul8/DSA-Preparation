package recursion;

public class TowerOfHanoi {

    public void transferDisk(int totalDisk, String source, String helper, String destination) {
        if (totalDisk == 1) {
            System.out.println("Transfer disk " + totalDisk + " from " + source + " to " + destination);
            return;
        }
        transferDisk(totalDisk - 1, source, destination, helper);
        System.out.println("Transfer disk " + totalDisk + " from " + source + " to " + destination);
        transferDisk(totalDisk - 1, helper, source, destination);

    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.transferDisk(3, "source", "helper", "destination");
    }

}
