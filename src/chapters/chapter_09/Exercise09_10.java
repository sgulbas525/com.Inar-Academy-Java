package chapters.chapter_09;

import java.util.Scanner;

public class Exercise09_10 {
    public static void main(String[] args) {
        double[] values = getFromUser();
        QuadraticEquation equation = new QuadraticEquation
                (values[0], values[1], values[2]);
        display(equation);
    }

    public static double[] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[] values = new double[3];

        System.out.println("Enter values for a, b, c respectively: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        return values;
    }



    public static void display(QuadraticEquation equation) {
    if (equation.getRoot1() == 0){
        System.out.println("The equation has no root");
    }else if(equation.getRoot1() == equation.getRoot2()){
        System.out.println("The equation has a root " + equation.getRoot1());
    }else
        System.out.println("The equation has two roots " +
                equation.getRoot1() + " and " + equation.getRoot2());

    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getDiscriminant() {
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        double root1 = (-getB() + Math.sqrt(getDiscriminant())) /
                (2 * getA());
        return root1;
    }

    public double getRoot2(){
        if (getDiscriminant() < 0) {
            return 0;
        }
        double root2 = (-getB() - Math.sqrt(getDiscriminant())) /
                (2 * getA());
        return root2;
    }
}