package chapters.chapter_09.Checkpoints09;

public class Checkpoint09_23_24 {
    public static void main(String[] args) {

        // Checkpoint09_23

        /* By passing primitive type to a method we just pass its value but
         by passing reference type we pass its address in the heap memory.
          So our change in method will affect the reference but no the primitive value.
         */

        Count myCount = new Count();
        int times = 0;

        for (int i = 0; i < 100; i++) {
            increment(myCount, times);
        }

        System.out.println("count is " + myCount.count);
        System.out.println("times is " + times);




        // Checkpoint09_24

        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);

        swap1(circle1, circle2);
        System.out.println("After swap1: circle1 = " + circle1.radius +
                " circle2 = " + circle2.radius);

        swap2(circle1, circle2);
        System.out.println("After swap2: circle1 = " + circle1.radius +
                " circle2 = " + circle2.radius);


    }


    public static void increment(Count c, int times) {
        c.count++;
        times++;
    }


    public static void swap1(Circle x, Circle y) {
        Circle temp = x;
        x = y;
        y = temp;
    }


    public static void swap2(Circle x, Circle y) {
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }
}


class Count {
    public int count = 0;

    public Count() {
        count = 1;
    }

    public Count(int c) {
        count = c;
    }
}


class Circle {
    double radius;

    Circle(double newRadius) {
        radius = newRadius;
    }
}

