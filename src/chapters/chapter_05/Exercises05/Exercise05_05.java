package chapters.chapter_05.Exercises05;

public class Exercise05_05 {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;
        final double KILOGRAMS_PER_POUND = 0.4535;
        System.out.println("Kilogram         Pounds     |      Pounds       Kilograms");
        for (int i = 1, j = 20; i < 200; i += 2, j += 5)
            System.out.printf("%-11d %11.1f %5c %8c %-11d %6.2f\n",
                    i, i * POUNDS_PER_KILOGRAM, '|', ' ', j, j * KILOGRAMS_PER_POUND );


    }
}
