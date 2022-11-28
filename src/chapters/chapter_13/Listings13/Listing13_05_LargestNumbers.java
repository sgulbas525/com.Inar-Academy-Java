package chapters.chapter_13.Listings13;

import java.util.ArrayList;
import java.math.*;

public class Listing13_05_LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45); // Add an integer
        list.add(3445.53); // Add an integer
        // Add a BigInteger
        list.add(new BigInteger("3432323234344343101"));
        // Add a BigDecimal
        list.add(new BigDecimal("2.09090909890913434333"));

        System.out.println("The largest number is " + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }

        return number;
    }
}