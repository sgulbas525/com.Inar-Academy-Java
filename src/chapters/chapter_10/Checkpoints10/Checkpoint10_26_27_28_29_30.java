package chapters.chapter_10.Checkpoints10;

public class Checkpoint10_26_27_28_29_30 {


    // Checkpoint10_26

    /*
    They are same but 1 difference, it's that StringBuffer is synchronized
     */










    // Checkpoint10_27
    /*
    String s = "Serhat Gulbas";
    StringBuilder stringBuilder = new StringBuilder(s);
    stringBuilder.toString();
     */










    // Checkpoint10_28
   /*
    String s = "Serhat Gulbas";
    StringBuilder stringBuilder = new StringBuilder(s);
    stringBuilder.reverse();
    s = stringBuilder.toString();
    */










    // Checkpoint10_29
    /*
    String s = "Benim adim Serhat Gulbas";
    StringBuilder stringBuilder = new StringBuilder(s);
    stringBuilder.delete(4, 10);
    s = stringBuilder.toString();
     */










    // Checkpoint10_30
    /*
    Both uses array for store characters. String is once created it's size is fixed but StringBuilder isn't so.
    It's size can be changed, to accommodate the change system uses a new array
     */
}
