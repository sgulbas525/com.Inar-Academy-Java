package weeks.week_14;

public class Animal {
    //Datafields
    protected double weight;
    protected double height;
    protected boolean hasSwimmingSkills;
    protected boolean hasFlyingSkills;

    public Animal() {
        this.hasFlyingSkills = false;
        this.hasSwimmingSkills = false;
        this.weight = 0;
        this.height = 0;
    }

    public Animal(double weight, double height, boolean hasSwimmingSkills, boolean hasFlyingSkills) {
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public void runs() {
        System.out.println("Animal is running");
    }

    public void eats() {
        System.out.println("Animal is eating");
    }

    public void sleeps() {
        System.out.println("Animal is sleeping");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }

    final public void animalMethod() {
        System.out.println("This is the final method from animal");
    }

    @Override
    public String toString() {
        return String.format("Weight:%s\nHeight:%s\nhasFlyingSkills:%s\nhasSwimmingSkills;%s", weight, height, hasFlyingSkills, hasSwimmingSkills);
    }
}
