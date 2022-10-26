package chapters.chapter_09.Exercises09;

public class Exercise09_01 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Width and height of r1: " + r1.width + " and " + r1.height +
                "\nArea of r1 is: " + r1.getArea() +
                "\nPerimeter of r1 is: " + r1.getPerimeter());

        System.out.println("\nWidth and height of r2: " + r2.width + " and " + r2.height +
                "\nArea of r2 is: " + r2.getArea() +
                "\nPerimeter of r1 is: " + r2.getPerimeter());
    }
}


class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
