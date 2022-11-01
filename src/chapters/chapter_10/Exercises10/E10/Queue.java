package chapters.chapter_10.Exercises10.E10;

public class Queue {
    private int[] elements;
    private int size;


    public Queue() {
        elements = new int[8];
        size = 0;// counts the number of elements in the queue
    }

    public void enqueue(int v) {
        // If the size exceeds the capacity doubled the capacity
        if (size >= elements.length) {
            int[] tempElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, tempElements, 0, elements.length);
            elements = tempElements;
        }
        // Add to queue by the size after adding increase the size

        elements[size] = v;
        size++;
    }

    public int dequeue() {
        // FiFo ---> First in First out
        // keep the head of the queue
        int n = elements[0];
       // Shifts the queue by one to left
        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
       // decrease the size because we remove one element and return the head of the queue that we assign toa variable
        size--;
        return n;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
