package recursion;

public class FindLastOccurrance {

    static int first = -1;
    static int last = -1;

    public static void find(String s, char element, int index) {

        if (index == s.length()) {
            System.out.println("First occurrence is at " + first);
            System.out.println("Last occurrence is at " + last);
            return;
        }
        if (s.charAt(index) == element) {
            if (first == -1)
                first = index;
            else
                last = index;
        }
        find(s, element, ++index);

    }

    public static void main(String[] args) {
        find("HelloWorld",'l',0);
    }
}
