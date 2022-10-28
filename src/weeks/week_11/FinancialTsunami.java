package weeks.week_11;

import java.util.Scanner;

public class FinancialTsunami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of th banks and the limits: ");
        int numberOfBanks = input.nextInt();
        double limit = input.nextDouble();

        double[][] banks = new double[numberOfBanks][];
        for (int i = 0; i < banks.length; i++) {
            banks[i] = getBanksCircumstancesFroUser(i);
        }

        boolean[] unsafeBanks = checkBanks(banks, limit);
        displayUnsafeBanks(unsafeBanks);

    }

    public static boolean[] checkBanks(double[][] banks, double limit) {
        double asset;
        boolean[] unsafeBanks = new boolean[banks.length];

        for (int b = 0; b < banks.length; b++) {
            if (unsafeBanks[b]) {
                continue;
            }

            asset = banks[b][0];


            for (int i = 1; i < banks[b].length; i += 2) {
                if (!unsafeBanks[(int) banks[b][i]]) {
                    asset += banks[b][i + 1];
                }
            }

            if (asset < limit) {
                unsafeBanks[b] = true;
                b = -1;

            }

        }

        return unsafeBanks;

    }

    public static void displayUnsafeBanks(boolean[] unsafeBanks) {
        System.out.print("Unsafe banks are ");
        for (int i = 0; i < unsafeBanks.length; i++) {
            if (unsafeBanks[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static double[] getBanksCircumstancesFroUser(int i) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the borrowers numbers  bank " + i + ":");
        int b = input.nextInt();

        double[] borrower = new double[b * 2 + 1];
        System.out.println("Enter the balance amount of bank " + i + ": ");

        borrower[0] = input.nextDouble();

        System.out.println("Enter the banks and their debt's amount to bank " + i + ": ");
        for (int j = 1; j < borrower.length; j++) {
            borrower[j] = input.nextDouble();
        }
        return borrower;
    }
}
