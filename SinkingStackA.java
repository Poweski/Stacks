import Zad6.EmptyStackException;
import Zad6.FullStackException;

public class SinkingStackA<E> {
    private final VTS<E> stack;
    private int size;
    private final int capacity;

    public SinkingStackA(int capacity) {
        stack = new VTS();
        this.capacity = capacity;
        size = 0;
    }

    public void push(E value) throws EmptyStackException, FullStackException {
        if (size == capacity) {
            stack.reverse();
            stack.pop();
            stack.reverse();
        }
        else
            size++;
        stack.push(value);
    }

    public E pop() throws EmptyStackException {
        size--;
        return stack.pop();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}