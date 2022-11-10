package chapters.chapter_10.Exercises10.E05;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        // returns the top element of stack but doesn't remove
        return elements[size - 1];
    }

    public void push(int value) {
        // If the size exceeds the capacity doubled the capacity
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        // Add the newest element to the top of the stack
        elements[size++] = value;
    }

    public int pop(){
        // LIFO --> Last in First out so removes the last input
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}


