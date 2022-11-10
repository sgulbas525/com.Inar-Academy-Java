package chapters.chapter_11.Exercises11.E06;

import chapters.chapter_10.Listings10.Listing10_02_Loan;
import chapters.chapter_11.Listings11.Listing11_02_CircleFromSimpleGeometricObject;
import java.util.ArrayList;
import java.util.Date;

public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Listing10_02_Loan());
        list.add(new Date());
        list.add(new Listing11_02_CircleFromSimpleGeometricObject(5));
        list.add("LoyLoyLoy");


        for (Object o : list) {
            System.out.println(o);
            System.out.println("-------");
        }
    }

}
