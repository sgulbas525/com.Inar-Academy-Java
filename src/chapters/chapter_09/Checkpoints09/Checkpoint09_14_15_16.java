package chapters.chapter_09.Checkpoints09;

import javafx.geometry.Point2D;

import java.util.Date;

public class Checkpoint09_14_15_16 {
    public static void main(String[] args) {

        // Checkpoint09_14

        Date currentTime = new Date();
        System.out.println(currentTime.toString());





        // Checkpoint09_15

        Point2D p1 = new Point2D(1, 5);
        Point2D p2 = new Point2D(5, -5);
        System.out.println("The distance is: " + p1.distance(p2));







        // Checkpoint09_16

        /* System-----------> is in java.lang
           Date-------------> is in java.util
           Random-----------> is in java.util
           Point2D----------> is in javafx.geometry
           Math-------------> is in java.lang
         */
    }
}
