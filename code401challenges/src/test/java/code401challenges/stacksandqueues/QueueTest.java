package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueueTest() {
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue((5));
        System.out.println(q);
        assertTrue(q.toString().equals("Front --> 1 --> 2 --> 5 --> Back"));
    }

    @Test (expected =  NullPointerException.class)
    public void dequeueTest() {
        Queue<Integer> q = new Queue<Integer>();
        assertTrue(q.dequeue() == null);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue((5));
        q.dequeue();
        assertTrue(q.toString().equals("Front --> 2 --> 5 --> Back"));
        q.dequeue();
        q.dequeue();
        assertTrue(q.toString().equals("Front --> Back"));
    }

    @Test (expected =  NullPointerException.class)
    public void peekTest() {
        Queue<Integer> q = new Queue<Integer>();
        assertTrue(q.peek().equals(null));
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(3);
        assertTrue(q.peek().equals(5));
    }

    @Test
    public void testToString() {
        Queue<Integer> q = new Queue<Integer>();
        System.out.println(q);
    }
}