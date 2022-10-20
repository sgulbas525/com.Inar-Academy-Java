package chapters.chapter_10.Listings10;

public class Listing10_04_BMI {
    private String name;
    private int age;
    private double height;
    private double weight;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public Listing10_04_BMI(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Listing10_04_BMI(String name, double height, double weight){
        this(name, 20, height, weight);
    }

    public double getBMI(){
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));

        return Math.round(bmi * 100) / 100;
    }

    public String getStatus(){
        double bmi = getBMI();
        if (bmi < 18.5){
            return "Underweight";
        }else if(bmi < 25){
            return "Normal";
        }else if(bmi < 30){
            return "Overweight";
        }else {
            return "Obese";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}

