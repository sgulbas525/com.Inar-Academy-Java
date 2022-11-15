package chapters.chapter_12.Exercises12.E01;

public class Exercise12_01_B {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java E12_01_B operand1 operator operand2");
            System.exit(1);
        }

        if (!isNumber(args[0])) {
            displayInputError(args[0]);
            System.exit(2);
        }

        if (!isNumber(args[2])) {
            displayInputError(args[2]);
            System.exit(3);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '.': result = a * b; break;
            case '/': result = a / b;
        }

        System.out.println(a + " " + args[1] + " " + b +
                " = " + result);
    }

    public static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) { return false; }
        }
        return true;
    }

    public static void displayInputError(String arg) {
        System.out.println("Wrong input: " + arg);
    }
}
