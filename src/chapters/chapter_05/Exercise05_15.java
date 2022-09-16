public class Exercise05_15 {
    public static void main(String[] args) {
   final int CHARACTERS_PER_LINE = 10;
   int count = 0;
        for (int i = '!'; i <= '~'; i++){
            count++;
            if(count % CHARACTERS_PER_LINE == 0)
                System.out.println((char)(i));
            else
                System.out.print((char)(i) + " ");
        }
    }
}
