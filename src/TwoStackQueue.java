import java.util.Stack;

public class TwoStackQueue<T> {
    private final Stack<T> inStack = new Stack<>();
    private final Stack<T> outStack = new Stack<>();

    public void enqueue(T item) {
        inStack.push(item);
    }
    public T dequeue() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    public T peek() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    public int size() {
        return inStack.size() + outStack.size();
    }
}