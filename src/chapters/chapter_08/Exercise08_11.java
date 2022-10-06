package chapters.chapter_08;

import java.util.Scanner;

public class Exercise08_11 {
    public static void main(String[] args) {
        int number = getNumberFromUser();

        int[][] binaryNumber = getNumbersBinary(number);
        displayAsHeadAndTails(binaryNumber);
    }

    public static void displayAsHeadAndTails(int[][] binaryNumber) {
        for (int i = 0; i < binaryNumber.length; i++) {
            for (int j = 0; j < binaryNumber[i].length; j++) {
                if (binaryNumber[i][j] == 0) {
                    System.out.print("H ");
                } else {
                    System.out.print("T ");
                }
            }
            System.out.println();
        }

    }

    public static int[][] getNumbersBinary(int number) {
        int[][] binary = new int[3][3];

        // Finds the binary corresponding of number and assign it to a String
        String binaryValue = "";
        while (number != 0) {
            binaryValue = (number % 2) + binaryValue;
            number /= 2;
        }
        // Our matrix total element capacity is 9, so we need to start the binary digits on the right place.
        // To finding the right places : binaryValue is "111" matrix is _ _ _   _ _ _   _ _ _ and the binaryValue
        // should fill the last 3(binaryValue()) elements with index [2][0]-[2][1]-[2][2] we can start that point with
        //total elements mines binaryValue.length.
        for (int i = 9 - binaryValue.length(), j = 0; j < binaryValue.length(); i++, j++) {
            // 9 - 3 = 6  6 / 3 = 2 - 6 % 3 = 0 -->[2][0] ....
            binary[i / 3][i % 3] =(int)(binaryValue.charAt(j) - '0');
            // It takes the ascii code of 0's and 1's, so hve to mines '0'
        }
        /*  The other way
        int binaryValuesLength = binaryValue.length() - 1;
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                binary[i][j] = binaryValue.charAt(binaryValuesLength);
                binaryValuesLength--;
            }

            if (binaryValuesLength < 0){
                break;
            }
        }*/

        return binary;
    }


    public static int getNumberFromUser() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number between 0 and 511: ");
            int number = input.nextInt();
            if (0 <= number && number < 512) {
                return number;
            }
        }
    }
}