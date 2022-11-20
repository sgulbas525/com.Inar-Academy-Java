package weeks.week_15.Exception;

import java.io.IOException;
import java.util.Scanner;


public class Math {

    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // arrayIOBExample();
        // arrayIOBExampleWithTryCatch();
        //
        // try {
        //    divWithTryCatch();
        // }catch (ArithmeticException ae){
        //    System.out.println("Main method yakaladi");
        // }catch(InputMismatchException ie){
        //    System.out.println("Lutfen adam akilli sayi girin");
        // }
        // System.out.println("Main bitti");

        try {
            divWithOneTryCatch();
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("IndexOutOfBoundException yakalandi");
        } catch (Exception e) {
            System.out.println("Exception yakalandi");
            System.out.println("The Messenger: " + e.getMessage());
        }
    }

    private static void divWithOneTryCatch() {
        System.out.println("Please enter two numbers to calculate n1/n2: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.printf("%d / %d = %d", n1, n2, (n1 / n2));
    }

    public static void divWithTryCatch() {
        System.out.println("Please enter two numbers to calculate n1/n2");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        try {
            System.out.println(n1 / n2);
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException ae) {
            System.out.println("Yanlis girdin index out of bounds yakaladi try - catch");
        } catch (NullPointerException ae) {
            System.out.println("yanlis girdin arithmetic yakaladi");
        }

        System.out.println("div metot bitti");
    }

    public static void arrayIOBExample() {
        System.out.print("sayi giriniz :");
        int n1 = input.nextInt();
        int[] arr = new int[2];

        if (n1 >= arr.length) {
            System.out.println("Yanlis girdin if-else yakaladi");
        } else {
            System.out.println(arr[n1]);
        }
    }

    public static void arrayIOBExampleWithTryCatch() {
        System.out.print("sayi giriniz :");
        int n1 = input.nextInt();
        int[] arr = new int[2];

        //Exception handling
        try {
            System.out.println(arr[n1]);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Yanlis girdin try-catch yakaladi");
        }

        System.out.println("Try dan sonraki satir");
    }

    public static void div() {
        System.out.println("Please enter two numbers to calculate n1/n2");
        int n1 = input.nextInt();
        int n2 = input.nextInt();


        if (n2 == 0) {
            System.out.println(" Yanlis girdin");
        }
        System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
    }

}
