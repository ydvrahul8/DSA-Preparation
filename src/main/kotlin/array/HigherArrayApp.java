package array;

public class HigherArrayApp {

    public static void main(String[] args) {
        HigherArray array = new HigherArray(100);
        array.insert(203);
        array.insert(234);
        array.insert(132);
        array.insert(634);
        array.insert(2023);
        array.insert(2213);
        array.insert(6341);
        array.print();

        int number = 22130;
        System.out.println(number + "is in array - " + array.find(number));

        int number1 = 0132;
        System.out.println(number + "is in deleted array - " + array.delete(number1));
        array.print();

    }

}
