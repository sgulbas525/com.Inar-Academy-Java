package weeks.week_08;

import java.util.Scanner;

public class IsRotation {
    //InarAcademyInarAcademy

    //    demyAcaInar      false
    // InAcademyar         false
    // demyInarAca         true
    // myInarAcade         true

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s1 = input.nextLine();

        System.out.println("Enter the  string: ");
        String s2 = input.nextLine();

        boolean result = isRotationOnAnother(s1, s2);
        System.out.println(result);
    }

    public static boolean isRotationOnAnother(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s2.equals(rotation(s1, i))) {
                return true;
            }
        }
        return false;
    }

    public static String rotation(String s1, int i) {
        String s3 = "";
        // takes from i to end and added it to s3
        for (int j = i; j < s1.length(); j++) {
            s3 += s1.charAt(j);
        }
        // takes from 0 to i and added to s3
        for (int j = 0; j < i; j++) {
            s3 += s1.charAt(j);
        }
        return s3;
    }
    /* public static boolean isRotationOneAnother(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        String s3 = s1 + s1;
        return s3.contains(s2);
    } */


}
