package chapters.chapter_09.Listings09;

public class Listing09_06_CircleWithStaticMembers {
    /* The radius of the circle */
    double radius;

    /* The number of the objects created */
    static int numberOfObjects = 0;

    /* Construct a circle with a specified radius */
    Listing09_06_CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }

    /* Construct a circle with a specified radius */
    Listing09_06_CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    /* Return numberOfObjects */
    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    /* Return the area of this circle */
    double getArea(){
        return radius * radius * Math.PI;
    }
}
