package recursion;

public class MoveCharInString {

    public static void moveAllX(String s, int index, int count, String newString) {
        if (index == s.length()) {
            for (int i = 0; i < count; i++) {
                newString = newString.concat("X");
            }
            System.out.println(newString);
            return;
        }
        char currentChar = s.charAt(index);
        if (currentChar == 'x') {
            count++;
            moveAllX(s, ++index, count, newString);
        } else {
            newString = newString + currentChar;
            moveAllX(s, ++index, count, newString);
        }


    }

    public static void main(String[] args) {
        moveAllX("axxbcdxxe", 0, 0, "");
    }

}
