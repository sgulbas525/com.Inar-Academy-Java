package chapters.chapter_06.Exercises06;

public class Exercise06_15 {
    public static void main(String[] args) {
        System.out.printf("%-18s %-18s %-20s %-20s %-1s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-18s %-18s %-20s %-20s %-1s\n", "Income", "", "or Qualifying", "Separate", "a House");
        System.out.printf("%-18s %-18s %-20s %-20s %-1s\n", "", "", "Widow(er)", "", "");
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 50_000; i <= 60_000; i += 50) {
            System.out.printf("%-20d", i);
            for (int j = 0; j < 4; j++)
                System.out.printf("%-20d", Math.round(computeTax(j, i)));
            System.out.println();
        }
    }
    public static double computeTax(int status, double taxableIncome) {

        if (status == 0) {
            if (taxableIncome <= 8350)
                return taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                return 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 82250)
                return 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 171550)
                return 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            else if (taxableIncome <= 372950)
                return 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (taxableIncome - 171550) * 0.33;
            else
                return 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
        } else if (status == 1) {
            if (taxableIncome <= 16700)
                return taxableIncome * 0.10;
            else if (taxableIncome <= 67900)
                return 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            else if (taxableIncome <= 137050)
                return 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
            else if (taxableIncome <= 208850)
                return 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.283;
            else if (taxableIncome <= 372950)
                return 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (taxableIncome - 208850);
            else
                return 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;

        } else if (status == 2) {
            if (taxableIncome <= 8350)
                return taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                return 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 68525)
                return 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 104425)
                return 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 104425) * 0.28;
            else if (taxableIncome <= 186475)
                return 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (taxableIncome - 186475) * 0.33;
            else
                return 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;

        } else if (status == 3) {
            if (taxableIncome <= 11950)
                return taxableIncome * 0.10;
            else if (taxableIncome <= 45500)
                return 11950 * 0.10 + (taxableIncome - 45500) * 0.15;
            else if (taxableIncome <= 117450)
                return 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
            else if (taxableIncome <= 190200)
                return 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 190200) * 0.28;
            else if (taxableIncome <= 372950)
                return 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (taxableIncome - 190200) * 0.33;
            else
                return 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
            return 0.0;
        }

    }
}
