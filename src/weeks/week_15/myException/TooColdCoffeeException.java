package weeks.week_15.myException;

public class TooColdCoffeeException extends RuntimeException{
    public TooColdCoffeeException() {
        super("This coffee is too cold");
    }

    public TooColdCoffeeException(String message) {
        super(message);
    }
}
