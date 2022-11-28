package chapters.chapter_13.Checkpoints13;

public class Checkpoint13_22_23_24_25_26 {

    // Checkpoint13_22
    /*
    Yes you can invoke clone method by writing your own.
    Yes, Date class implements Cloneable
     */


    // Checkpoint13_23
    /*
    There would be a compile error.
     */


    // Checkpoint13_24
    /*
    java.util.Date date = new java.util.Date();
    java.util.Date date1 = date;
    java.util.Date date2 = (java.util.Date)(date.clone());
    System.out.println(date == date1);-----> True
    System.out.println(date == date2);-----> False
    System.out.println(date.equals(date2));------> True
     */



    // Checkpoint13_25
    /*
    ArrayList<String> list = new ArrayList<>();
    list.add("New York");
    ArrayList<String> list1 = list;
    ArrayList<String> list2 = (ArrayList<String>)(list.clone());
    list.add("Atlanta");
    System.out.println(list == list1);-----> True
    System.out.println(list == list2);-----> False
    System.out.println("list is " + list);-----> [New York, Atlanta]
    System.out.println("list1 is " + list1);-----> [New York, Atlanta]
    System.out.println("list2.get(0) is " + list2.get(0));-----> New York
    System.out.println("list2.size() is " + list2.size());-----> 1
     */



    // Checkpoint13_26
    /*
    GeometricObject x = new Circle(3);
    GeometricObject y = x.clone();
    System.out.println(x == y);

    Have to override clone method.
     */
}
