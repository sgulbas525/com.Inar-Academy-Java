package chapters.chapter_10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {

        String s1 = "Welcome".replace('e', 'A');
        System.out.println("\"Welcome\".replace('e', 'A') = " + s1);
        s1 = "Welcome".replaceFirst("e", "AB");
        System.out.println("\"Welcome\".replaceFirst(\"e\", \"AB\") = " + s1);
        s1 = "Welcome".replace("e", "AB");
        System.out.println("\"Welcome\".replace(\"e\", \"AB\")" + s1);
        s1 = "Welcome".replace("el", "AB");
        System.out.println("\"Welcome\".replace(\"el\", \"AB\") = " + s1);

        System.out.println("Java is fun.matches(\"Java.*\" = " + "Java is fun".matches("Java.*"));
        System.out.println("Java is cool.matches(\"Java.*\" = " + "Java is cool".matches("Java.*"));
        System.out.println("Java is powerful.matches(\"Java.*\" = " + "Java is powerful".matches("Java.*"));
        System.out.println("\"440-02-4534\".matches(\"\\\\d{3}-\\\\d{2}-\\\\d{4}\") = " + "440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));

        String s = "a+b$#c".replaceAll("[$+#]", "NNN");
        System.out.println("\"a+b$#c\".replaceAll(\"[$+#]\", \"NNN\") = " + s);

        String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
        System.out.println("\"Java,C?C#,C++\".split(\"[.,:;?]\"");
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]);
System.out.println("\n");

        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        System.out.println(Arrays.toString(dst));
        "CS3720".getChars(2, 6, dst, 4);
        System.out.println("\"CS3720\".getChars(2, 6, dst, 4); =>" + Arrays.toString(dst));

        String str = new String(new char[]{'J', 'a', 'v', 'a'});
        System.out.println("str = new String(new char[]{'J', 'a', 'v', 'a'}) => " + str);

        String str1 = new String(new char[]{'J', 'a', 'v', 'a'});
        System.out.println("str1 = new String(new char[]{'J', 'a', 'v', 'a'}) => " + str1);


        String str2 = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
        System.out.println("String.format(\"%7.2f%6d%-4s\", 45.556, 14, \"AB\") = " + str2);
    }

}
