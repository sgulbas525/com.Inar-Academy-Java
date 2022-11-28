package chapters.chapter_13.Listings13;

import java.util.Date;

public abstract class Listing13_01_GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Constructor a default geometric object
    protected Listing13_01_GeometricObject() {
        dateCreated = new java.util.Date();
    }

    // Constructor a geometric object with color and filled value
    protected Listing13_01_GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    // Get dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Return color
    public String getColor() {
        return color;
    }

    // Set a new color
    public void setColor(String color) {
        this.color = color;
    }

    // Return filled. Since filled is boolean.
    // the get method is named isFilled
    public boolean isFilled() {
        return filled;
    }

    // Set a new filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    // Abstract method area
    public abstract double getArea();

    // Abstract method getPerimeter
    public abstract double getPerimeter();
}
