package stack_queue;

import java.util.Stack;

public class Stack_Brackets {

    public static void main(String[] args) {
        String input = "a{b[c]d}e";
//        String input = "a[b{c}d]e}";

        System.out.println(validateString(input));

    }

    private static boolean validateString(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            switch (currentChar) {
                case '{':
                case '[':
                case '(':
                    stack.push(currentChar);
                    break;
                case '}':
                    if(stack.empty() || stack.peek()!='{')
                        return false;
                    else
                        stack.pop(); break;
                case ')':
                    if(stack.empty() || stack.peek()!='(')
                        return false;
                    else
                        stack.pop(); break;
                case ']':
                    if(stack.empty() || stack.peek()!='[')
                        return false;
                    else
                        stack.pop(); break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }

}
