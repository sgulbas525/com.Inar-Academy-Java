package chapters.chapter_05;

public class Exercise05_07 {
    public static void main(String[] args) {
        double tuition = 10000;
        double cost = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("For year %d tuition is %.2f \n", (i + 1), tuition);
            tuition = tuition + tuition * 0.05;
        }
        for (int i = 0; i < 4; i++) {
            cost += tuition + tuition * 0.05;
        }
        System.out.printf("For the total four years cost's after the first 10 years %.2f",
                cost);
    }
}
