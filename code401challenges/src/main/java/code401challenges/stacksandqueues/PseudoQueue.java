package code401challenges.stacksandqueues;

public class PseudoQueue<T> {

    Stack<T> helperStack = new Stack<>();
    Stack<T> pseudoQueue = new Stack<>();

    //First-in, first-out approach

    public void enqueue(T value) {
        helperStack.push(value);
    }

    public T dequeue() {
        while(helperStack.top != null) {
            pseudoQueue.push(helperStack.pop());
        }
        T result = pseudoQueue.pop();
//        pseudoQueue.push(result);
        while(pseudoQueue.top != null) {
            helperStack.push(pseudoQueue.pop());
        }
        return result;
    }

}
