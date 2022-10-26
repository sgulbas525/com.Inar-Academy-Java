package chapters.chapter_09.Exercises09.E10;

import chapters.chapter_09.Exercises09.E10.QuadraticEquation;

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

