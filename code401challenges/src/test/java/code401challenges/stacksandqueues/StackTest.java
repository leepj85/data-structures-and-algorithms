package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void push() {
    }

    @Test
    public void testToString() {
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.push(3);
        intStack.push(2);
        intStack.push(1);
//        System.out.println(intStack);
        String results = intStack.toString();
        assertTrue(results.equals("Top --> 1 --> 2 --> 3 --> Bottom"));
    }

    @Test (expected = NullPointerException.class)
    public void testPop() {
        Stack<Integer> stack = new Stack<Integer>();
        assertTrue(stack.pop() == null);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        int result = stack.pop();
//        System.out.println(result);
//        System.out.println(stack);
        assertTrue(result == 1);
        assertTrue(stack.toString().equals("Top --> 2 --> 3 --> Bottom"));
        stack.pop();
        stack.pop();
        assertTrue(stack.toString().equals("Top --> Bottom"));
//        System.out.println(stack);
        stack.pop();
    }

    @Test (expected = NullPointerException.class)
    public void testPeek() {
        Stack<Integer> stack = new Stack<Integer>();
        assertTrue(stack.peek() == null);
        stack.push(3);
        System.out.println(stack.peek());
        assertTrue(stack.peek() == 3);
        stack.push(2);
        System.out.println(stack.peek());
        assertTrue(stack.peek() == 2);

    }
}