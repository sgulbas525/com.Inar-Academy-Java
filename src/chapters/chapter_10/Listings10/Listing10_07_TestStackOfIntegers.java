package chapters.chapter_10.Listings10;

public class Listing10_07_TestStackOfIntegers {
    public static void main(String[] args) {
        Listing10_08_StackOfIntegers stack = new Listing10_08_StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
