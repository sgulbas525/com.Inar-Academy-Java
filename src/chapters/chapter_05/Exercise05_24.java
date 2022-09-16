public class Exercise05_24 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 99; i += 2){
            sum = sum + i / (i + 2.0);
        }
        System.out.printf("Sum is " + sum);
    }
}
