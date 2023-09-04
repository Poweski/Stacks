import java.util.EmptyStackException;

public class SinkingStackB<E> {
    private static final int DEFAULT_CAPACITY = 10;
    E[] array;
    int beginIndex;
    int endIndex;

    @SuppressWarnings("unchecked")
    public SinkingStackB(int size) {
        array = (E[])new Object[size+1];
    }
    public SinkingStackB() {
        this(DEFAULT_CAPACITY);
    }

    public boolean isEmpty() {
        return beginIndex == endIndex;
    }
    public boolean isFull() {
        return beginIndex == (endIndex+1)%array.length;
    }
    public E pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        E retValue = array[(beginIndex+1)%array.length];
        moveBeginForward();
        return retValue;
    }
    public void push(E elem) {
        if (isFull())
            moveEndBackward();
        array[beginIndex] = elem;
        moveBeginBackward();
    }
    public int size() {
        return (endIndex+array.length-beginIndex) % array.length;
    }

    public E first() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        return array[beginIndex];
    }
    private void moveEndBackward () {
        array[endIndex] = null;     //nullujemy element, ktory powinnismy utracic przez przesuniecie enda
        endIndex--;
        if (endIndex == -1)
            endIndex = array.length-1;
    }
    private void moveBeginBackward () {
        beginIndex--;
        if (beginIndex == -1)
            beginIndex = array.length-1;
    }
    private void moveBeginForward () {
        array[(beginIndex+1)%array.length] = null;
        beginIndex = (++beginIndex) % array.length;
    }

    public static void main(String[] args) throws EmptyStackException {
        SinkingStackB<Integer> vts = new SinkingStackB<>(2);
        vts.push(1);
        vts.push(2);
        vts.push(3);
        vts.push(4);
        System.out.println(vts.pop());
        System.out.println(vts.pop());
    }
}