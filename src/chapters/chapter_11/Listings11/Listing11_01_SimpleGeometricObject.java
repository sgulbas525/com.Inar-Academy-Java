package chapters.chapter_11.Listings11;

import java.util.Date;

public class Listing11_01_SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /* Construct a default geometric object */
    public Listing11_01_SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }

    public Listing11_01_SimpleGeometricObject(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }
    // Return color

    public String getColor() {
        return color;
    }
    // Set a new color

    public void setColor(String color) {
        this.color = color;
    }
    //Return filled. Since filled is boolean, its getter method is named isFilled

    public boolean isFilled() {
        return filled;
    }
    // Set a new filled

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // Get dateCreated

    public Date getDateCreated() {
        return dateCreated;
    }

    // Return a string representation of this object
    public String toString(){
        return "created on " + getDateCreated() + "\ncolor: " + getColor() +
                " and filled: " + isFilled();
    }





}
