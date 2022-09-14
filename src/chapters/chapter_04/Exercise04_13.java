import  java.util.Scanner;

public class Exercise04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a letter: ");
        String s = input.next();

        if(s.length() > 1 || !Character.isLetter(s.charAt(0))){
            System.out.println(s + " is an invalid input");
        }
        else {
            System.out.print(s.charAt(0) + " is a ");
            char ch = s.toLowerCase().charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i'
                    || ch == 'o')
                System.out.print("vowel");
            else
                System.out.print("consonant");
        }
    }
}
