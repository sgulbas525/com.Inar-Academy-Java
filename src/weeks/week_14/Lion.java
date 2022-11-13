package weeks.week_14;

public class Lion extends Animal{
    private int tailSize;

    public Lion() {
        super();
        super.hasSwimmingSkills = true;
        this.tailSize = 10;
    }

    public Lion(int tailSize){
        super(100,180,true,false);
        this.tailSize = tailSize;
    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }

    //Annotation
    @Override
    public void eats(){
        System.out.println("Lion is eating");
        Math.random();
    }

    @Override
    public String toString() {
        return "Lion{" +
                "tailSize=" + tailSize +
                '}';
    }

    // Final methods cannot be overriden
//    @Override
//    public void animalMethod(){
//
//    }


}