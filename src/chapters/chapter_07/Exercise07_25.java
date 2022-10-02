package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_25 {
    public static void main(String[] args) {
          double[] eqn = getFromUser();
        if (hasRoot(eqn)) {
            double[] roots = getRoots(eqn);
            displayRoots(roots);
        } else {
            System.out.println("The equation has no real root.");
        }
    }

    public static boolean hasRoot(double[] eqn) {
        double r = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        return r > 0;
    }

    public static double[] getRoots(double[] eqn) {
        double r = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        double[] roots;

        if (r == 0) {
            roots = new double[1];
            roots[0] = (-eqn[1] + Math.pow(r, 0.5)) / 2;
        } else {
            roots = new double[2];
            roots[0] = (-eqn[1] + Math.pow(r, 0.5)) / 2;
            roots[1] = (-eqn[1] - Math.pow(r, 0.5)) / 2;
        }
        return roots;
    }

    public static void displayRoots(double[] roots) {
        System.out.println("Equation's root(s) : ");

        for (int i = 0; i < roots.length; i++) {
            System.out.print(roots[i] + "   ");
        }
    }

    public static double[] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];

        System.out.println("Enter a, b, c for the equation: ");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        return eqn;
    }
}
