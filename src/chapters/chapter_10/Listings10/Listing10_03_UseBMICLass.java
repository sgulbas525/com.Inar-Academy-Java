package chapters.chapter_10.Listings10;

public class Listing10_03_UseBMICLass {
    public static void main(String[] args) {
        Listing10_04_BMI bmi1 = new Listing10_04_BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBMI() + " " + bmi1.getStatus());

        Listing10_04_BMI bmi2 = new Listing10_04_BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBMI() + " " + bmi2.getStatus());

    }
}