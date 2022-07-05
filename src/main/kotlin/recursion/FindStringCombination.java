package recursion;

public class FindStringCombination {

    public static void stringCombination(String s, String combination) {

        if (s.length() == 0) {

            System.out.println(combination);
            return;

        }

        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);
            String newString = s.substring(0, i) + s.substring(i + 1);
            stringCombination(newString, combination + currentChar);

        }

    }

    public static void main(String[] args) {
        stringCombination("abc", "");
    }
}
