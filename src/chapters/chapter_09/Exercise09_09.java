package chapters.chapter_09;

public class Exercise09_09 {
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6, 4);
        RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("r1's perimeter is " + r1.getPerimeter() +
                " and it's area is " + r1.getArea());
        System.out.println("r2's perimeter is " + r2.getPerimeter() +
                " and it's area is " + r2.getArea());
        System.out.println("r3's perimeter is " + r3.getPerimeter() +
                " and it's area is " + r3.getArea());
    }
}

class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this(3, 1.0);
    }

    public RegularPolygon(int n, double side) {
        this(n, side, 0, 0);
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getN() {
        return n;
    }

    public double getPerimeter(){
        return getN() * getSide();
    }

    public double getArea(){
        double area = (getN() * Math.pow(getSide(), 2)) /
                (4 * Math.tan(Math.PI / getN()));
        return area;
    }
}

