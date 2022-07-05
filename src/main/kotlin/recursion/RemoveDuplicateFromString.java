package recursion;

public class RemoveDuplicateFromString {

    public static boolean map[] = new boolean[26];

    public static void removeDuplicate(String s, int index, String newString) {
        if (index == s.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = s.charAt(index);
        if (map[currentChar - 'a']) {
            removeDuplicate(s, ++index, newString);
        } else {
            newString += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicate(s, ++index, newString);
        }
    }

    public static void main(String[] args) {
        removeDuplicate("abbcdeeffgd", 0, "");
    }
}
