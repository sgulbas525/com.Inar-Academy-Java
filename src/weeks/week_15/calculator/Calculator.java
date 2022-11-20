package weeks.week_15.calculator;

public class Calculator {
    public static Number sum(Number n1, Number n2) {
        int val = n1.getValue() + n2.getValue();
        Number n3 = new Number(val);

        return n3;
    }

    public static Number divide(Number n1, Number n2) {
        return new Number(n1.getValue() / n2.getValue());
    }

    public static Number multiply(Number n1, Number n2) {
        return new Number(n1.getValue() * n2.getValue());

    }

    public static Number subtract(Number n1, Number n2) {
        return new Number(n1.getValue() - n2.getValue());
    }

    public static Number mod(Number n1, Number n2) {
        return new Number(n1.getValue() % n2.getValue());
    }

    public static void reset(Number n1, Number n2) {
        n1 = null;
        n2 = null;
    }

    public static void reset(Number n) {
        n = null;

    }
    public static void changeSign(Number n1) {
        n1.setValue(n1.getValue() * -1);
    }
}