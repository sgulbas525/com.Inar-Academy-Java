package chapters.chapter_06;

public class Exercise06_27 {
    public static void main(String[] args) {

        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < 100) {
            if (isPrime(number) && isEmirp(number)) {
                count++;
                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }

    public static boolean isEmirp(int num) {
        // reverse the numbers (13 to 31)
        String str = "" + num;
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        // call isPrime with the reversed number
       int numberReversed = Integer.parseInt(reversed);
        if (isPrime(numberReversed) && numberReversed != num)
            return true;
        else
            return false;
        // else return false
    }

    public static boolean isPrime(int number) {
        for (int d = 2; d <= number / 2; d++) {
            if (number % d == 0) {
                return false;
            }
        }
        return true;
    }
}