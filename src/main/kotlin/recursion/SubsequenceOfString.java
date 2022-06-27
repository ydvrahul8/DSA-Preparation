package recursion;

import java.util.HashSet;

public class SubsequenceOfString {
    /**
     * Write a program to get all the subsequence from the string.
     * eh. string s = "abc"
     * output :-
     * abc
     * ab
     * ac
     * bc
     * a
     * b
     * c
     */
    public static void subsequence(String s, int index, String newString) {

        if (index == s.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = s.charAt(index);
        subsequence(s, index + 1, newString + currentChar);
        subsequence(s, index + 1, newString);

    }

    /**
     * Write a program to get all the unique subsequence from the string.
     * eg. String s = "aaa";
     * output:-
     * aaa
     * aa
     * a
     */


    public static void uniqueSequence(String s, int index, String newString, HashSet<String> set) {
        if (index == s.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = s.charAt(index);
        uniqueSequence(s, index + 1, newString + currentChar, set);
        uniqueSequence(s, index + 1, newString, set);
    }

    public static void main(String[] args) {
        //subsequence("abc", 0, "");

        HashSet<String> set = new HashSet<String>();
        uniqueSequence("aaa", 0, "", set);
    }
}
