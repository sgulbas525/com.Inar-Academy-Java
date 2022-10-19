package weeks.week_09;

import java.util.Scanner;

public class DistinctNumbers {
    // 1 1 1 1 1 1 1 1 1
    // 1 2 3 4 5 6 7 8 9 10
    // 1 2 3 1 5 2 4 7 8 9
    // distinctNumber ------> 1 2 3 5
    // countDistinctNumber - 3
    public static void main(String[] args) {

        int[] numbers = getFromUser();
        int[] distinctNumbers = new int[10];
        int countDistinctNumber = 0 ;

        for (int n = 0; n < numbers.length; n++) {
            if (contains(numbers[n], distinctNumbers, countDistinctNumber)){
                distinctNumbers[countDistinctNumber] = numbers[n];
                countDistinctNumber++;
            }
        }

        displayArray(distinctNumbers, countDistinctNumber);





    }

    public static void displayArray(int[] distinctNumbers, int countDistinctNumber) {
        System.out.println("Total number of distinct numbers : " + countDistinctNumber);


        for (int n = 0; n < countDistinctNumber; n++) {
            System.out.print(distinctNumbers[n] + " ");
        }
    }

    // 1 2 3 1 5 2 4 7 8 9
    // distinctNumber ------> 1 2 3
    // counDistinctNumber - 3
    private static boolean contains(int number, int[] distinctNumbers, int countDistinctNumber) {
        for (int n = 0; n < countDistinctNumber; n++) {
            if (number == distinctNumbers[n]){
                return false;
            }
        }
        return true;
    }

    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] arr = new int[10];

        for (int n = 0; n < arr.length; n++) {
            arr[n] = input.nextInt();
        }

        return arr;
    }
}