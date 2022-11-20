package weeks.week_15.myException;

public class Test {
    public static void main(String[] args) throws TooHotCoffeeException{
        Person person = new Person();
        System.err.println("BU HATA");
        Coffee turkKahvesi = new Coffee("Turk Kahvesi", 14);
        person.drink(turkKahvesi);
    }
}
