package chapters.chapter_10.Listings10;

public class Listing10_08_StackOfIntegers {
    private int[] elements;
    private int size;
    private static int DEFAULT_CAPACITY = 16;

    public Listing10_08_StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public Listing10_08_StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop(){
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}
