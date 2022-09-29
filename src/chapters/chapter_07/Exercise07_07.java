package chapters.chapter_07;

public class Exercise07_07 {
    public static void main(String[] args) {

        int[] numbers = createAnArrayWithRandomNumbers();
        int[] numberOfSingleDigits = countSingleDigits(numbers);
        displayArray(numberOfSingleDigits);
    }

    public static int[] createAnArrayWithRandomNumbers() {
    int[] array = new int[100];
        // Array creating with 100 elements which are random
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        return array;
    }

    public static void displayArray(int[] numberOfSingleDigits) {
        for (int i = 0; i < numberOfSingleDigits.length; i++) {
            System.out.println("Occurrences of " + i + "'s: " + numberOfSingleDigits[i]);
            // Displaying through the indexes
        }
    }

    public static int[] countSingleDigits(int[] numbers) {
        int[] countOccurrences = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            countOccurrences[numbers[i]]++;// Array's indexes are representing the digits
        }
        return countOccurrences;

    }
    }
