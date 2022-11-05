package chapters.chapter_10.Exercises10.E22;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > length() || begin > end)
            System.out.println("Invalid substring parameters!");

        char[] c = new char[end - begin];
        for (int indexChars = begin, indexC = 0; indexChars < end; indexChars++, indexC++) {
            c[indexC] = chars[indexChars];
        }
        return new MyString1(c);
    }

    public MyString1 toLowerCase() {
        char[] c = new char[chars.length];

        for (int index = 0; index < chars.length; index++) {
            char ch = chars[index];
            if ('Z' >= ch && ch >= 'A') {
                c[index] = (char) (chars[index] + ('a' - 'A'));
            } else {
                c[index] = chars[index];
            }

        }

        return new MyString1(c);
    }

    public boolean equals(MyString1 s) {
        if (s.length() != chars.length) {
            return false;
        }

        for (int index = 0; index < chars.length; index++) {
            if (s.charAt(index) != charAt(index)) {
                return false;
            }
        }

        return true;
    }

    public static MyString1 valueOf(int i) {
        int countTheDigits = 0;
        int number = i;

        while (number > 0) {
            number /= 10;
            countTheDigits++;
        }

        char[] ch = new char[countTheDigits];

        for (int index = countTheDigits - 1; index >= 0; index--) {
            ch[index] = (char) ('0' + (i % 10));
            i /= 10;
        }

        return new MyString1(ch);
    }


   /* Code for checking the outputs. Override is chapter 11's topic
    @Override
    public String toString() {
        return new String(chars);
    }*/
}