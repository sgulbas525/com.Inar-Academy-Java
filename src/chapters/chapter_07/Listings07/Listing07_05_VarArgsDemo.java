package chapters.chapter_07.Listings07;

public class Listing07_05_VarArgsDemo {
    public static void main(String[] args) {
        printMax(34, 5, 2, 98, 75);
        printMax(new double[]{1, 2, 3});
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The max value is " + max);
    }
}

