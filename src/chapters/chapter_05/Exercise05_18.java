package chapters.chapter_05;

public class Exercise05_18 {
    public static void main(String[] args) {
        //A
        for (int a = 0; a < 6; a++) {
            for (int i = 1; i <= a + 1; i++)
                System.out.print(i + "  ");
            System.out.println();
        }

        System.out.println("\n\n");

        //B
        for (int b = 0; b < 6; b++) {
            for (int i = 1; i <= 6 - b; i++)
                System.out.print(i + "  ");
            System.out.println();
        }

        System.out.println("\n\n");
        //C
        for (int c = 0; c < 6; c++) {
            for (int i = c + 1; i < 6; i++)
                System.out.print("   ");
            for (int j = c + 1; j > 0; j--)
                System.out.print(j + "  ");
            System.out.println();
        }

        System.out.println("\n\n");
        //D
        for (int d = 0; d < 6; d++) {
            for (int i = 0; i < d; i++)
                System.out.print("   ");
            for (int i = 1; i <= 6 - d; i++)
                System.out.print(i + "  ");
            System.out.println();
        }
    }
}
