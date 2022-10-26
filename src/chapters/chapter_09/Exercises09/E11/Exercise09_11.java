package chapters.chapter_09.Exercises09.E11;

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

