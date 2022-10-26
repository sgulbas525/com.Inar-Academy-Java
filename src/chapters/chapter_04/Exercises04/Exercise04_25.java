package chapters.chapter_04.Exercises04;

public class Exercise04_25 {
    public static void main(String[] args) {
        String plate = "" ;

        plate += (char)((Math.random() * 26) + 65);
        plate += (char)((Math.random() * 26) + 65);
        plate += (char)((Math.random() * 26) + 65);
        plate += (int)(Math.random() * 10);
        plate += (int)(Math.random() * 10);
        plate += (int)(Math.random() * 10);
        plate += (int)(Math.random() * 10);

        System.out.println("Your vehicle plate is " + plate);

    }
}
