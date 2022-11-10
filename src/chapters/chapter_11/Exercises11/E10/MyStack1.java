package chapters.chapter_11.Exercises11.E10;

import java.util.ArrayList;

public class MyStack1 extends ArrayList<Object> {
    public int getSize() {
        return size();
    }

    public void push(Object o) {
        add(o);
    }

    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

   /* public boolean isEmpty() {
        return super.isEmpty();
    } We have not to write it.
    */

    @Override
    public String toString() {
        return "stack: " + toString();
    }
}
