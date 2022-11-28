package chapters.chapter_13.Listings13;

import java.util.Date;

public class Listing13_11_House implements Cloneable, Comparable<Listing13_11_House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public Listing13_11_House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    // Override the protected clone method defined in
    // the Object class, and strengthen its accessibility
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


    @Override
    // Implement the compareTo method defined in Comparable
    public int compareTo(Listing13_11_House o){
        if (area > o.getArea())
            return 1;
        else if (area < o.getArea())
            return -1;
        else
            return 0;
        }
    }

