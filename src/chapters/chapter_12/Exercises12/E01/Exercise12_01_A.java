package chapters.chapter_12.Exercises12.E01;

public class Exercise12_01_A {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: operand1 operator operand2");
            System.exit(1);
        }

        try {
            Integer.parseInt(args[0]);
        } catch (Exception ex) {
            System.out.println("wrong input: " + args[0]);
            System.exit(2);
        }

        try {
            Integer.parseInt(args[2]);
        } catch (Exception ex) {
            System.out.println("wrong input: " + args[2]);
            System.exit(3);
        }

        Integer number1 = Integer.parseInt(args[0]);
        Integer number2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '.':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
        }

        System.out.println(number1 + " " + args[1] + " " + number2 +
                " = " + result);
    }
}






