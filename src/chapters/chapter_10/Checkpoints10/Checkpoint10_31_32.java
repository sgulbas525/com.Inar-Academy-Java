package chapters.chapter_10.Checkpoints10;

public class Checkpoint10_31_32 {
    public static void main(String[] args) {

       // Checkpoint10_31

        //Assume that the statements are independent.
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");

        s1.append(" is fun");// ---------------------------> Java is fun
        s1.append(s2);// ----------------------------------> JavaHTML
        s1.insert(2, "is fun");// ----------------> JAis funava
        s1.insert(1, s2);// -----------------------> JHTMLava
        s1.charAt(2);// -----------------------------------> v
        s1.length();// ------------------------------------> 4
        s1.deleteCharAt(3);// -----------------------> Jav
        s1.delete(1, 3);// --------------------------------> Ja
        s1.reverse();// -----------------------------------> avaJ
        s1.replace(1, 3, "Computer");// ------> JComputera
        s1.substring(1, 3);// -----------------------------> av
        s1.substring(2);// ---------------------------> va










        // Checkpoint10_32

        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        change(s, builder);
        System.out.println(s);
        System.out.println(builder);
    }
    private static void change(String s, StringBuilder builder) {
        s = s + " and HTML";
        builder.append(" and HTML");
    }
}
