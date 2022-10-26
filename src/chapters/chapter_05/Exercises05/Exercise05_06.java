package chapters.chapter_05.Exercises05;

public class Exercise05_06 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;
        final double MILES_PER_KILOMETER = 0.621;
        System.out.println("Miles       Kilometers  |   Kilometers      Miles");
        for (int i = 1, j = 20; i < 11; i++, j += 5){
            System.out.printf("%-11d %-11.3f %-3c %-15d %-1.3f\n",
                    i, i*KILOMETERS_PER_MILE, '|', j, j * MILES_PER_KILOMETER);
        }
    }
}
