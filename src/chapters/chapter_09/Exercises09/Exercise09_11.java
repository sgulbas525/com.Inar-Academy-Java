package chapters.chapter_09.Exercises09;

import java.util.Scanner;

public class Exercise09_11 {
    public static void main(String[] args) {
        double[] values = getFromUser();
        LinearEquation equation = new LinearEquation(values[0],
                values[1], values[2], values[3], values[4], values[5]);
        display(equation);

    }

    public static void display(LinearEquation equation) {
        if (equation.isSolvable()) {
            System.out.println("For the equation x is " +
                    equation.getX() + " adn y is " + equation.getY());
        } else
            System.out.println("The equation has no root");
    }


    public static double[] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[] values = new double[6];

        System.out.println("Enter values for a, b, c, d, e. f respectively: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        return values;
    }
}

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c,
                          double d, double e, double f) {
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

    public boolean isSolvable() {
        return ((getA() * getD()) - (getB() * getC())) == 0;
    }

    public double getX() {
        double x = ((getE() * getD()) - (getB() * getF())) /
                ((getA() * getD()) - (getB() * getC()));
        return x;
    }

    public double getY() {
        double y = ((getA() * getF()) - (getE() * getC())) /
                ((getA() * getD()) - (getB() * getC()));
        return y;
    }
}
