package chapters.chapter_05;

public class Exercise05_23 {
    public static void main(String[] args) {
         double sum = 0;
         for(int i = 1; i <= 50000; i++)
             sum = sum + 1.0 / i ;

        System.out.println("From left to right sum is " + sum);
         sum = 0 ;
         for (int i = 50000; i >= 1; i--)
             sum = sum + 1.0 / i;
        System.out.println("From right to left sum is " + sum);
    }
}
