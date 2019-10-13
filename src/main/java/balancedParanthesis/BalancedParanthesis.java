package balancedParanthesis;

import java.util.Stack;

public class BalancedParanthesis {
    private static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    private static boolean openTerm(char c) {
        for (char[] array : TOKENS) {
            if (array[0] == c) {
                return true;
            }
        }
        return false;
    }

    private static boolean matches(char openTerm, char closeTerm) {
        for (char[] array : TOKENS) {
            if (array[0] == openTerm) {
                return array[1] == closeTerm;
            }
        }
        return false;
    }

    public static boolean isBalanced(String expression) {
        expression = expression.replaceAll("\\s+","");
        Stack<Character> stack = new Stack<Character>();
        for (char c : expression.toCharArray()) {
            if (openTerm(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !matches(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{ ( [ ( ) ] ) }"));
    }
}
