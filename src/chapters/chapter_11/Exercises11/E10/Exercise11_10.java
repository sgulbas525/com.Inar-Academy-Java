package chapters.chapter_11.Exercises11.E10;

import java.util.Scanner;

public class Exercise11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack1 s = getStack(input);
        int size = s.getSize();

        for (int i = 0; i < size; i++) {
            System.out.println(s.pop());
        }
    }

    public static MyStack1 getStack(Scanner input) {
        System.out.print("Enter five strings: ");
        MyStack1 s = new MyStack1();
        for (int i = 0; i < 5; i++) {
            s.push(input.next());
        }
        return s;
    }

}
