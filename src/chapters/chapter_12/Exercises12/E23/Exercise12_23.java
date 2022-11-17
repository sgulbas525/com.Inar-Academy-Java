package chapters.chapter_12.Exercises12.E23;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_23 {
    public static void main(String[] args) throws Exception {
        String url = getTheURLFromUser();
        URL url1 = new URL(url);

        double sum = 0;
        int count = 0;
        try (
                Scanner input = new Scanner(url1.openStream())
        ) {
            while (input.hasNext()) {
                sum += input.nextDouble();
                count++;
            }

        }
        System.out.printf("Sum of the numbers is %.2f\n" +
                        "Average of the numbers is %.1f",
                sum, (sum / count));
    }

    private static String getTheURLFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the file's url: ");
        String url = input.nextLine();
        return url;
    }
}