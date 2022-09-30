package chapters.chapter_07;

import java.util.Scanner;

public class Exercise07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_NUMBERS = 10;

        System.out.print("Enter " + NUMBER_OF_NUMBERS + " numbers: ");
        double[] list = new double[NUMBER_OF_NUMBERS];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
    }

        selectionSortByMax(list);
        Exercise07_12.displayArray(list);
}

    public static void selectionSortByMax(double[] list) {
        double max ;
        int index;
        for (int i = list.length - 1; 0 < i ; i--) {
            max = list[i];
            index = i;

            for (int j = i - 1; 0 <= j ; j--) {
              if (max < list[j]){
                  max = list[j];
                  index = j;
              }
            }

            if(i != index){
                list[index] = list[i];
                list[i] = max;
            }
        }

        }

    }
