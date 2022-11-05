package chapters.chapter_10.Exercises10.E23;

import chapters.chapter_10.Exercises10.E22.MyString1;

public class MyString2 {
    private char[] chars;

    public MyString2(String s) {
        chars = s.toCharArray();
    }

    public MyString2(char[] chars) {
        this.chars = chars;
    }

    public int compare(String s) {
        int countS = 0;
        int countS1 = 0;

        while (countS1 < chars.length && countS < s.length()) {
            if (chars[countS1] != s.charAt(countS)) {
                return s.charAt(countS) - chars[countS1];
            }
            countS1++;
            countS++;
        }
        if (countS1 == chars.length && countS == s.length()) {
            return 0;
        } else if (countS1 == chars.length) {
            return -1;
        } else {
            return 1;
        }

    }

    public MyString2 substring(int begin) {
        if (begin < 0 || begin >= chars.length) {
            System.out.println("Wrong begin index!");
            System.exit(1);
        }
        char[] ch = new char[chars.length - begin];

        for (int i = begin, startIndex = 0; i < chars.length; i++, startIndex++) {
            ch[startIndex] = chars[i];
        }
        return new MyString2(ch);
    }

    public MyString2 toUpperCase() {
        char[] c = new char[chars.length];

        for (int index = 0; index < chars.length; index++) {
            char ch = chars[index];
            if ('z' >= ch && ch >= 'a') {
                c[index] = (char) (chars[index] - ('a' - 'A'));
            } else {
                c[index] = chars[index];
            }
        }
        return new MyString2(c);
    }

    public char[] toChars() {
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        return new MyString2(b ? "true" : "false");
    }

/* Code for checking the outputs. Override is chapter 11's topic
    @Override
    public String toString() {
        return new String(chars);
    }*/
}