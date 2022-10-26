package chapters.chapter_07.Exercises07;

public class Exercise07_13 {
    // getRandom(1, 5 , 78 , 12 , 78, 98, 12) --------  getRandom(new int[]{1, 25 , 54, 89})

    // public static int getRandom(int[] numbers)

    public static int getRandom(int... numbers) {
        int number = 0;
        boolean isInNumbers = true;// For checking our number is whether inside the number array

        while (isInNumbers) {
            isInNumbers = false;// Start with thinking not inside tha number array
            number = (int) (Math.random() * 53) + 1;

            for (int i = 0; i < numbers.length; i++) {
                // If it's in the numbers array isInNumber will be true
                if (number == numbers[i]) {
                    isInNumbers = true;
                    break;
                }
            }
            // If isInNumber is false it means the number isn't in the numbers array, so we can return it
            if (!isInNumbers) {
                break;
            }
            // If isInNumber is true it means carry on to get a random number
        }
        return number;
    }
}

