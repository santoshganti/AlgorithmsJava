package net.santoshganti.DataStructures.Stacks;

import java.util.Stack;

public class SortTwoStacks {

    /*
     * Create a temporary stack say tmpStack.
     *
     * While input stack is NOT empty do this:
     *
     * Pop an element from input stack call it temp
     *
     * while temporary stack is NOT empty and top of temporary stack is greater than
     * temp,
     *
     * pop from temporary stack and push it to the input stack
     *
     * push temp in temporary stack
     *
     * The sorted numbers are in tmpStack
     */
    public static java.util.Stack<Integer> sortstack(java.util.Stack<Integer> stack) {
        if (stack == null || stack.isEmpty())
            return stack;

        java.util.Stack<Integer> newStack = new java.util.Stack<>();

        newStack.push(stack.pop());

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!newStack.isEmpty() && temp > newStack.peek()) {
                stack.push(newStack.pop());
            }
            newStack.push(temp);
        }
        return newStack;
    }

    public static void main(String[] args) {
        java.util.Stack<Integer> input = new java.util.Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        // This is the temporary stack
        Stack<Integer> tmpStack = sortstack(input);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty()) {
            System.out.print(tmpStack.pop() + " ");
        }
    }
}
