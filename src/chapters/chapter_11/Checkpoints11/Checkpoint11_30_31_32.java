package chapters.chapter_11.Checkpoints11;

public class Checkpoint11_30_31_32 {

    // Checkpoint11_30
    /*
    a. Create an ArrayList for storing double values?-----------> ArrayList<Double> list = new ArrayList<>();
    b. Append an object to a list?------------------------------> list.add(Object);
    c. Insert an object at the beginning of a list?-------------> list.add(0, Object);
    d. Find the number of objects in a list?--------------------> list.getSize();
    e. Remove a given object from a list?-----------------------> list.remove(Object);
    f. Remove the last object from the list?--------------------> list.remove(list.getSize() - 1);
    g. Check whether a given object is in a list?---------------> list.contains(Object);
    h. Retrieve an object at a specified index from a list?-----> list.get(index);
     */



    // Checkpoint11_31
    /*
    ArrayList<String> list = new ArrayList<>();
    list.add("Denver");
    list.add("Austin");
    list.add(new java.util.Date());// Cannot add a different object type
    String city = list.get(0);
    list.set(3, "Dallas");// There isn't any elements in index 3 to set
    System.out.println(list.get(3));// There isn't any element in index 3
     */


    // Checkpoint11_32
    /*
    ArrayList<String> city = new ArrayList<>();
    city.add("Dallas");
    city.add("Dallas");
    city.add("Houston");
    city.add("Dallas");

    after one time invoking list.remove("Dallas");
    [Dallas, Houston, Dallas]

    after for (int i = 0; i < list.size(); i++)
            list.remove("Dallas");:
            That code is wrong.
     */
}
