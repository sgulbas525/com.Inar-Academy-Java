package chapters.chapter_13.Listings13;

public class Listing13_09_ComparableRectangle extends Listing13_03_Rectangle
        implements Comparable<Listing13_09_ComparableRectangle>{
    // Construct a ComparableRectangle with specified properties
    public Listing13_09_ComparableRectangle(double witdh, double height){
        super(witdh, height);
    }

    @Override
    // Implement the compareTo method defined in Comparable
    public int compareTo(Listing13_09_ComparableRectangle o){
        if(getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    // Implement the toString method in GeometricObject
    public String toString(){
        return super.toString() + " Area: " + getArea();
    }
}
