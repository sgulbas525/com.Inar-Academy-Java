package chapters.chapter_06.Exercises06;

public class Exercise06_09 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-15s %-10s %-12s %s\n", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("------------------------------------------------------------");

        for (int i = 1, j = 20; i <= 11; i++, j += 5){
            System.out.printf("%-10.1f %-15.3f %-10s %-12.1f %7.3f \n", (double)i, footToMeters(i), "|",
                    (double)j, meterToFoot(j));
        }
    }

    public static double footToMeters(double foot){
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
