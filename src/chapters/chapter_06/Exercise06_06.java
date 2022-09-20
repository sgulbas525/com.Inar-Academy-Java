package chapters.chapter_06;

public class Exercise06_06 {
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++){

            for (int j = n ; j > i; j--){
                System.out.printf("%-3s", "");
            }
            for (int j = i; j > 0; j--){
                System.out.printf("%-3d", j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPattern(5);
    }
}

