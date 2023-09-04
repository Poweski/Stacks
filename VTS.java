import Zad6.ArrayStack;
import Zad6.EmptyStackException;
import Zad6.FullStackException;

import java.util.ArrayList;
import java.util.Stack;

public class VTS<E> {
    private ArrayList<E> stack;
    private final int MAX_NUMBER_ELEMENTS = 10;
    private int cursor;

    public VTS() {
        stack = new ArrayList<>();
        cursor = 0;
    }

    public void push(E value) throws FullStackException {
        cursor = 0;
        if (!isFull())
            stack.add(0,value);
        else
            throw new FullStackException();
    }

    public E pop() throws EmptyStackException {
        cursor = 0;
        if (!isEmpty())
            return stack.remove(0);
        throw new EmptyStackException();
    }

    public boolean isFull() {
        return stack.size() == MAX_NUMBER_ELEMENTS;
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public E top() throws EmptyStackException {
        cursor = 0;
        if (!stack.isEmpty())
            return stack.get(0);
        throw new EmptyStackException();
    }

    public E peek() throws EmptyStackException {
        if (stack.isEmpty())
            throw new EmptyStackException();
        return stack.get(cursor);
    }

    public boolean down() {
        if (stack.isEmpty())
            return true;
        return ++cursor == stack.size()-1;
    }

    public void reverse() throws EmptyStackException, FullStackException {
        VTS<E> tempStack = new VTS<>();

        while (!this.isEmpty())
            tempStack.push(this.pop());

        stack = tempStack.getElements();
    }

    private ArrayList<E> getElements() {
        return stack;
    }

    public static void main(String[] args) throws FullStackException, EmptyStackException {
        VTS<Integer> vts = new VTS();
        vts.push(1);
        vts.push(2);
        vts.push(3);
        vts.push(4);
        System.out.println(vts.down());
        System.out.println(vts.down());
        System.out.println(vts.down());
        System.out.println(vts.peek());
        System.out.println(vts.top());
    }
}
