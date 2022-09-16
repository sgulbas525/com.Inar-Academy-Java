public class Exercise05_12 {
    public static void main(String[] args) {
        int n = 0;
        while(Math.pow(n, 2) < 12000){
            n++;
        }
        System.out.println("The smallest n such that n pow 2 is greater than 12,000 is " + n);
    }
}
