package recursion;

public class PrintKeypadCombination {

    public static String keyboard[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombination(String s, int index, String combination) {

        if (index == s.length()) {
            System.out.println(combination);
            return;
        }

        char currentChar = s.charAt(index);
        String map = keyboard[currentChar - '0'];
        for (int i = 0; i < map.length(); i++) {
            printCombination(s, index + 1, combination + map.charAt(i));
        }

    }

    public static void main(String[] args) {
        printCombination("7", 0, "");
    }


}
