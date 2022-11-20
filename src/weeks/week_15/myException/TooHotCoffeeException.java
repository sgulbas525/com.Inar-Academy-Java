package weeks.week_15.myException;

public class TooHotCoffeeException extends Exception{
    public TooHotCoffeeException() {
        super("This coffee is too hot");
    }

    public TooHotCoffeeException(String message) {
        super(message);
    }
}
