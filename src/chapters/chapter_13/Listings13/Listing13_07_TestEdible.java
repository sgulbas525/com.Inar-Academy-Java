package chapters.chapter_13.Listings13;

import weeks.week_14.Animal;

public class Listing13_07_TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible)
                System.out.println(((Edible) objects[i]).howToEat());

            if (objects[i] instanceof Animal1)
                System.out.println(((Animal1) objects[i]).sound());
        }
    }
}

abstract class Animal1 {
    // Return animal sound
    public abstract String sound();
}

class Chicken extends Animal1 implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal1 {
    @Override
    public String sound() {
        return "Tiger: RROAAR";
    }
}

abstract class Fruit implements Edible{
    // Data fields, constructors, and methods omitted here
}

class Apple extends Fruit{
    @Override
    public String howToEat(){
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit{
    @Override
    public String howToEat(){
        return "Orange: make orange juice";
    }
}