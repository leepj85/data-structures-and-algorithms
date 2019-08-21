package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    Queue<Integer> queue = new Queue<>();
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();

    @Test
    public void enqueueAndDequeueTest() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
//        System.out.println(pseudoQueue.dequeue());
        assertTrue(queue.dequeue().equals(pseudoQueue.dequeue()));
        assertTrue((queue.dequeue().equals(pseudoQueue.dequeue())));
    }



}