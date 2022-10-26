package chapters.chapter_09.Exercises09.E08;

import chapters.chapter_09.Exercises09.E08.Fan;

public class Exercise09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        System.out.println(fan1.toString());

System.out.println("--------------------");

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());

    }
}


