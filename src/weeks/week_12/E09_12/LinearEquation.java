package weeks.week_12.E09_12;


public class LinearEquation {
/*
ax + by = e
cx + dy = f

x =
(ed - bf)/
(ad - bc)

y =
(af - ec) /
(ad - bc)

   a            b           a               b
(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1

    c           d           c               d
(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3

Private data fields a, b, c, d, e, and f.
■ A constructor with the arguments for a, b, c, d, e, and f.
■ Six getter methods for a, b, c, d, e, and f.
■ A method named isSolvable() that returns true if ad - bc is not 0.
■ Methods getX() and getY() that return the solution for the equation.
 */
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // ad - bc is not 0.
    public boolean isSolvable(){
        return ((getA() * getD()) - (getB() * getC())) != 0;
    }

    /*
    x =
(ed - bf)/
(ad - bc)

y =
(af - ec) /
(ad - bc)
     */

    public double getX(){
        double x = (getE() * getD() - getB() * getF()) / ((getA() * getD()) - (getB() * getC()));
        return x;
    }

    public double getY(){
        double y = (getA() * getF() - getE() * getC()) / ((getA() * getD()) - (getB() * getC()));
        return y;
    }
}
