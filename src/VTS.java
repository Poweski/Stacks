import java.util.ArrayList;

public class VTS<E> {
    private ArrayList<E> stack;
    private int cursor;

    public VTS() {
        stack = new ArrayList<>();
        cursor = 0;
    }

    public void push(E value) throws FullStackException {
        cursor = 0;
        if (!isFull()) {
            stack.addFirst(value);
        }
        else {
            throw new FullStackException();
        }
    }

    public E pop() throws EmptyStackException {
        cursor = 0;
        if (!isEmpty())
            return stack.removeFirst();
        throw new EmptyStackException();
    }

    public boolean isFull() {
        int MAX_NUMBER_ELEMENTS = 10;
        return stack.size() == MAX_NUMBER_ELEMENTS;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public E top() throws EmptyStackException {
        cursor = 0;
        if (!stack.isEmpty()) {
            return stack.getFirst();
        }
        throw new EmptyStackException();
    }

    public E peek() throws EmptyStackException {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(cursor);
    }

    public boolean down() {
        if (stack.isEmpty()) {
            return true;
        }
        return ++cursor == stack.size()-1;
    }

    public void reverse() throws EmptyStackException, FullStackException {
        VTS<E> tempStack = new VTS<>();
        while (!this.isEmpty()) {
            tempStack.push(this.pop());
        }
        stack = tempStack.getElements();
    }
    private ArrayList<E> getElements() {
        return stack;
    }
}
