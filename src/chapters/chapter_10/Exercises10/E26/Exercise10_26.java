package chapters.chapter_10.Exercises10.E26;

public class Exercise10_26 {
    public static void main(String[] args) {
        String[] input = args[0].split("\\s+");

        if (!isValidInput(input)) {
            System.out.println("Usage: java Calculator " +
                    "\"operand1 operator operand2\"");
        }

        double result = 0;
        double a = Double.parseDouble(input[0]);
        char op = input[1].charAt(0);
        double b = Double.parseDouble(input[2]);

        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b;
        }

        System.out.println(a + " " + op + " " + b +
                " = " + result);
    }

    public static boolean isValidInput(String[] input) {
        if (input.length != 3) { return false; }
        if (input[1].length() != 1) { return false; }
        try {
            Double.parseDouble(input[0]);
            Double.parseDouble(input[2]);
        } catch (Exception e) {
            return false;
        }
        char c = input[1].charAt(0);
        if (c != '+' && c != '-' && c != '*' && c != '/') { return false; }
        return true;
    }
}

