package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of banks and the limit: ");

        int numberOfBanks = input.nextInt();
        double limit = input.nextDouble();
        double[][] banks = new double[numberOfBanks][];

        for (int i = 0; i < numberOfBanks; i++) {
            banks[i] = getBanksCircumstancesFromUser(i);
        }

        boolean[] unsafeBanks = checkBanks(banks, limit);
        displayUnsafeBanks(unsafeBanks);
    }

    public static boolean[] checkBanks(double[][] banks, double limit) {
        double asset;
        boolean[] unsafeBanks = new boolean[banks.length];// assign false to the unsafe banks index
        boolean hasAnyChange;
        // Have to check amount of banks according to banks that become unsafe
        while (true) {
            hasAnyChange = true;
            for (int i = 0; i < banks.length; i++) {
                asset = banks[i][0];

                for (int j = 2; j < banks[i].length; j += 2) {
                    // If the borrowed bank is safe add to the amount to the banks' asset
                    if (!unsafeBanks[(int) banks[i][j - 1]])
                        asset += banks[i][j];
                }

                // If the banks is unsafe assign false
                if (asset < limit) {
                    unsafeBanks[i] = true;
                    hasAnyChange = false;
                }
            }
            if (hasAnyChange)
                break;
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

    public static double[] getBanksCircumstancesFromUser(int i) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the borrower numbers of bank " + i + ": ");
        int borrower = input.nextInt();

        double[] borrowers = new double[borrower * 2 + 1];

        System.out.println("Enter the balance of bank " + i + ": ");
        borrowers[0] = input.nextDouble();

        System.out.println("Enter the banks and their debt's amount to bank " + i + ": ");
        for (int j = 1; j < borrowers.length; j++) {
            borrowers[j] = input.nextDouble();
        }

        return borrowers;
    }
}