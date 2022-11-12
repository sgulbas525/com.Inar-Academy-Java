package chapters.chapter_10.Exercises10.E12;

import chapters.chapter_10.Exercises10.E04.MyPoint;

public class MyTriangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public MyTriangle2D() {

      //  this(0, 0, 1, 1, 2, 5);
    this(new MyPoint(0,0), new MyPoint(1,1), new MyPoint(2,5));
    }

  /*  public MyTriangle2D(double p1X, double p1Y, double p2X, double p2Y, double p3X, double p3Y) {
        this(new MyPoint(p1X, p1Y), new MyPoint(p2X, p2Y), new MyPoint(p3X, p3Y));
    }*/


    public MyTriangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public double getArea() {
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        double s = (side1 + side2 + side3) / 3;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }

    public double getPerimeter() {
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        return side1 + side2 + side3;

    }

    public boolean contains(double x, double y) {
        MyPoint p = new MyPoint(x, y);

        boolean b1, b2, b3;

        b1 = loc(p, p1, p2) < 0.0;
        b2 = loc(p, p2, p3) < 0.0;
        b3 = loc(p, p3, p1) < 0.0;

        return ((b1 == b2) && (b2 == b3));

    }

    private double loc(MyPoint p, MyPoint p1, MyPoint p2) {

        double x = p.getX();
        double y = p.getY();
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();


        return (x - x2) * (y1 - y2) - (x1 - x2) * (y - y2);


    }

    public boolean contains(MyTriangle2D t) {
        MyPoint[] points = new MyPoint[3];
        points[0] = t.getP1();
        points[1] = t.getP2();
        points[2] = t.getP3();

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (this.contains(points[i].getX(), points[i].getY())) {
                count++;
            }
        }

            return count == 3;

    }


    public boolean overlaps(MyTriangle2D t) {
        MyPoint[] points = new MyPoint[3];
        points[0] = t.getP1();
        points[1] = t.getP2();
        points[2] = t.getP3();

        int count = 0;
        for(int i = 0; i < 3; i++) {
            if(this.contains(points[i].getX(), points[i].getY()))
                count++;
        }

        return (count > 0 && count < 3);
    }

    }



