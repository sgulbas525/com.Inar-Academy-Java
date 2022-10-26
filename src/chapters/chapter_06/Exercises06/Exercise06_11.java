package chapters.chapter_06.Exercises06;

public class Exercise06_11 {
    public static void main(String[] args) {
        System.out.printf("%-17s %13s\n", "Sales Amount", "Commission");
        System.out.println("---------------------------------");

        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-17d %10.1f\n", i, computeCommission(i));
        }
    }

    public static double computeCommission(double salesAmount) {
        double commission ;
        if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;

        } else if (salesAmount <= 10000) {
            salesAmount -= 5000;
            commission = (5000 * 0.08) + (salesAmount * .10);

        } else{
            commission = (5000 * 0.08);
            salesAmount -= 5000;

            commission += (5000 * .10);
            salesAmount -= 5000;

            commission += salesAmount * .12;
        }
        return commission;
    }
}
