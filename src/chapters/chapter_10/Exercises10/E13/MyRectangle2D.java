package chapters.chapter_10.Exercises10.E13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public boolean contains(double x, double y) {
        // if the points are in the range of out rectangle
        // x must be between the location between the left x and the right x location
        boolean xValid = (x < (getX() + getWidth() / 2) &&
                (x > (getX() - getWidth() / 2)));
        // y must be between the location between the top y and the bottom y location
        boolean yValid = (y < (getY() + getHeight() / 2) &&
                (y > (getY() - getHeight() / 2)));

        return xValid && yValid;
    }

    public boolean contains(MyRectangle2D r) {

        double[][] corners = getCorners(r);

        for (int c = 0; c < corners.length; c++) {
           // If one of the corners point isn't between the range of our main rectangle it's impossible to be contained by our main rectangle
            if (!contains(corners[c][0], corners[c][1])) {
                return false;
            }
        }
        return true;
    }

    // Finds the 4 corners location of the rectangle

    public double[][] getCorners(MyRectangle2D r) {

        double[][] corner = new double[4][2];

        corner[0][0] = r.getX() - getWidth() / 2;
        corner[0][1] = r.getY() + getHeight() / 2;
        corner[1][0] = r.getX() + getWidth() / 2;
        corner[1][1] = r.getY() + getHeight() / 2;
        corner[2][0] = r.getX() - getWidth() / 2;
        corner[2][1] = r.getY() - getHeight() / 2;
        corner[3][0] = r.getX() + getWidth() / 2;
        corner[3][1] = r.getY() - getHeight() / 2;

        return corner;
    }


    public boolean overlaps(MyRectangle2D r) {
        // If the top side is in a location lesser than our bottom side or the bottom side is greater than our top side
        // or the left side is on the right side of our right side or the right side is ont the left side of our left side
        // it means that the rectangle is out of out bounds
        if ((getY() + (getHeight() / 2) < r.getY() - (r.getHeight() / 2)) ||
                (getY() - (getHeight() / 2) > r.getY() + (r.getHeight() / 2)) ||
                (getX() + (getWidth() / 2) < r.getX() - (r.getWidth() / 2)) ||
                (getX() - (getWidth() / 2)) > r.getX() + (r.getWidth() / 2)) {
            return false;
        }
        return true;

    }

}



