package chapters.chapter_10;

public class StringBuilderClass {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        System.out.println(stringBuilder);
        stringBuilder.append(' ');
        System.out.println(stringBuilder);
        stringBuilder.append("to");
        System.out.println(stringBuilder);
        stringBuilder.append(' ');
        System.out.println(stringBuilder);
        stringBuilder.append("Java");
        System.out.println(stringBuilder);

        stringBuilder.insert(11, "HTML and");
        System.out.println(stringBuilder);


        stringBuilder.delete(8, 11);
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(8);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.replace(11, 15, "HTML");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(0, 'w');
        System.out.println(stringBuilder);

    }
}
