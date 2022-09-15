public class Exercise05_03 {
    public static void main(String[] args) {
        System.out.println("Kilograms        Pounds");
        final double POUNDS_PER_KILO = 2.2;
        for(int i = 1; i < 200; i += 2)
            System.out.printf("%-11d %11.1f\n", i, i*POUNDS_PER_KILO);
    }
}
