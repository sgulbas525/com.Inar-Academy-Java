package chapters.chapter_10.Exercises10.E28;


public class MyStringBuilder2 {
    private char[] value;

    public MyStringBuilder2() {
        this(new char[0]);
    }

    public MyStringBuilder2(char[] value) {
        this.value = value;
    }

    public MyStringBuilder2(String s) {
        value = s.toCharArray();
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 msb2) {
        char[] newValue = new char[msb2.length() + length()];

        for (int i = 0; i < offset; i++) {
            newValue[i] = value[i];
        }
        for (int i = offset; i < msb2.length() + offset; i++) {
            newValue[i] = msb2.charAt(i - offset);
        }
        for (int i = offset + msb2.length(); i < newValue.length; i++) {
            newValue[i] = value[i - msb2.length()];
        }

        value = newValue;
        return this;

    }

    private char charAt(int i) {
        return value[i];
    }

    public MyStringBuilder2 reverse() {
        for (int i = 0, e = length() - 1; i < length() / 2; i++, e--) {
            char temp = value[i];
            value[i] = value[e];
            value[e] = temp;
        }
        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        if (begin < 0 || begin >= value.length) {
            System.out.println("Wrong begin index!");
            System.exit(1);
        }

        char[] newValue = new char[length() - begin];

        for (int i = begin; i < length(); i++) {
            newValue[i - begin] = value[i];
        }

        value = newValue;
        return this;

    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < length(); i++) {
            if ('a' <= charAt(i) && charAt(i) <= 'z') {
                value[i] = (char) (charAt(i) - 32);
            } else {
                value[i] = charAt(i);
            }
        }

        return this;


    }

    private int length() {
        return value.length;
    }

    public String toString() {
        return String.valueOf(value);
    }
}

