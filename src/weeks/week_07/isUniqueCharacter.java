package weeks.week_07;

import java.util.Scanner;

public class isUniqueCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = input.nextLine();

        if(isUnique(s.toUpperCase()))
            System.out.println(s + " is unique");
        else
            System.out.println(s + " is not unique");
    }

    public static boolean isUnique(String s){
        for (int i = 0; i < s.length(); i++)
            for (int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        return true;
    }
}
