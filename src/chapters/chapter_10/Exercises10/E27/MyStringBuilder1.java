package chapters.chapter_10.Exercises10.E27;

public class MyStringBuilder1 {
    private char[] value;


    public MyStringBuilder1(String s) {
        this.value = new char[s.length()];

        for (int i = 0; i < length(); i++) {
            value[i] = s.charAt(i);
        }
    }


    public MyStringBuilder1 append(MyStringBuilder1 msb1) {

        char[] newValue = new char[length() + msb1.length()];
        System.arraycopy(value, 0, newValue, 0, length());

        int countIndex = length();

        for (int i = 0; i < msb1.length(); i++) {
            newValue[countIndex] = msb1.charAt(i);
            countIndex++;
        }

        value = newValue;

        return this;
    }

    public MyStringBuilder1 append(int number) {

        return append(new MyStringBuilder1(String.valueOf(number)));
    }


    public int length() {
        return value.length;
    }

    public char charAt(int i) {
        return value[i];
    }

    public MyStringBuilder1 toLowerCase() {

        for (int i = 0; i < length(); i++) {
            if ('A' <= charAt(i) && charAt(i) <= 'Z') {
                value[i] = (char) (charAt(i) + 32);
            } else {
                value[i] = charAt(i);
            }
        }

        return this;
    }


    public MyStringBuilder1 substring(int begin, int end) {
        if (begin < 0 || end > length() || begin > end) {
            System.out.println("Invalid substring parameters!");
            System.exit(1);
        }

        char[] ch = new char[end - begin];

        for (int i = 0, j = begin; j < end; i++, j++) {
            ch[i] = charAt(j);
        }

        return new MyStringBuilder1(String.valueOf(ch));
    }

    public String toString() {

        return String.valueOf(value);
    }

}
