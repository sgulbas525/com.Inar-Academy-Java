package chapters.chapter_10.Checkpoints10;

public class Checkpoint10_23_24_25 {
    public static void main(String[] args) {

        // Checkpoint10_23
        /*
        public class Test {
            String text;

            public void Test(String s) {
                text = s;
            }

            public static void main(String[] args) {
                Test test = new Test("ABC");
                System.out.println(test);
            }
        }// There isn't a constructor with a parameter
         */


        // Checkpoint10_24

        System.out.println("\"Hi, ABC, good\".matches(\"ABC \") -->" +
                "Hi, ABC, good".matches("ABC "));
        System.out.println("\"Hi, ABC, good\".matches(\".*ABC.*\") -->" +
                "Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("\"A,B;C\".replaceAll(\",;\", \"#\") -->" +
                "A,B;C".replaceAll(",;", "#"));
        System.out.println("\"A,B;C\".replaceAll(\"[,;]\", \"#\") -->" +
                "A,B;C".replaceAll("[,;]", "#"));
        String[] tokens = "A,B;C".split("[,;]");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");


        // Checkpoint10_25

        String s = "Hi, Good Morning";
        System.out.println("\n" + m(s));

    }

    public static int m(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        return count;

    }
}
