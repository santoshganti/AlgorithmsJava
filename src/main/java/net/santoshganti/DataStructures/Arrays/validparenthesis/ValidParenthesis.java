package net.santoshganti.DataStructures.Arrays.validparenthesis;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValid("()[]{}"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
