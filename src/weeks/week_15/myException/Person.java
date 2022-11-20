package weeks.week_15.myException;

public class Person {
    public void drink(Coffee coffee) throws TooHotCoffeeException{
        if (coffee.getTemp() > 80){
            TooHotCoffeeException hata = new TooHotCoffeeException();
            throw hata;
        } else if (coffee.getTemp() < 40) {
            throw new TooColdCoffeeException();
        }else
            System.out.println("I drink coffee");
    }
}
