package chapters.chapter_11.Checkpoints11;

public class Checkpoint11_26_27 {

    // Checkpoint11_26
    /*
                      Apple extends Fruit--------------------Orange extends Fruit
GoldenDelicious extends Apple--McIntosh extends Apple

Fruit fruit = new GoldenDelicious();
Orange orange = new Orange();

-fruit instanceof Fruit--------------> true
-fruit instanceof Orange-------------> false
-fruit instanceof Apple--------------> true
-fruit instanceof GoldenDelicious----> true
-fruit instanceof McIntosh-----------> false
-orange instanceof Orange------------> true
-orange instanceof Fruit-------------> true
-orange instanceof Apple-------------> false

i-makeAppleCider is defined in the Apple class.
    fruit.makeAppleCinder-----> no it cannot(but with casting yes)
    orange.makeAppleCinder----> no, it cannot
j-makeOrangeJuice is defined in the Orange class.
    orange.makeOrangeJuice----> yes it can
    fruit.makeOrangeJuice-----> no, it cannot
k-Orange p = new Apple()------> Illegal
l-McIntosh p = new Apple()----> Illegal
m-Apple p = new McIntosh()----> Legal
     */


    // Checkpoint11_27
    /*
    public class Test {
        public static void main(String[] args) {
            Object fruit = new Fruit();
            Object apple = (Apple)fruit;
            // fruit is the super class of apple to casting
            // to object class need to casting object
        }
    }

    class Apple extends Fruit {
    }

    class Fruit {
    }


    Object apple = (Apple)fruit;
    Causes a runtime ClassCastingException.w
     */
}
