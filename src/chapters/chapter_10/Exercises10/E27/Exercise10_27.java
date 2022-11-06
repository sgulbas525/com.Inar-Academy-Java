package chapters.chapter_10.Exercises10.E27;

public class Exercise10_27 {
        public static void main(String[] args) {
                MyStringBuilder1 a = new MyStringBuilder1("HAPPY");
                System.out.println(a);
                System.out.println(a.charAt(3));
                a.append(new MyStringBuilder1(" birthday"));
                System.out.println(a);
                a.append(100);
                System.out.println(a);
                a.toLowerCase();
                System.out.println(a);
                MyStringBuilder1 b = a.substring(3, 7);
                System.out.println(b);
        }

}
