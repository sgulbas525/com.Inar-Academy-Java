package chapters.chapter_06;

import java.util.Scanner;

public class Exercise06_08 {

    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %-10s %-19s %-1s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 40, j = 120; i > 30; i--, j -= 10) {
            System.out.printf("%-15.1f %-15.1f %-10s %-19.1f %-1.2f\n", (double) i, celsiusTOFahrenheit(i), "|",
                    (double) j, fahrenheitToCelsius(j));
        }
    }


    public static double celsiusTOFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
