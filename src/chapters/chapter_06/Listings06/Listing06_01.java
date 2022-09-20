package chapters.chapter_06.Listings06;

public class Listing06_01 {
    /**
     * Maint method
     */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i +
                " and " + j + " is " + k);
    }

    /**
     * Return the max of two numbers
     */
    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}
