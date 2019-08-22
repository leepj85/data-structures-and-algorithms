package code401challenges.utilities;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {
        Stack stack = new Stack();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (character == '{' || character == '(' || character == '[') {
                stack.push(character);
            }

            if (character == '}') {
                if ((char) stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }

            if (character == ')') {
                if ((char) stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }

            if (character == ']') {
                if ((char) stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}