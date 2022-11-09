package chapters.chapter_11.Listings11;

import java.util.ArrayList;

public class Listing11_10_MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize() - 1);
    }

    public Object pop(){
        Object o = peek();
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o){
        list.add(o);
    }

    @Override
    public String toString(){
        return "stack: " + list.toString();
    }
}
