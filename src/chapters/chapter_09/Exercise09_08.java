package chapters.chapter_09;

public class Exercise09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        System.out.println(fan1.toString());

System.out.println("--------------------");

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());

    }
}


class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
    public boolean getOn(){
        return on;
    }

    public String toString(){
        String output;
        if(getOn()) {
            output = "Fan speed is: " + getSpeed() +
                    "\nColor is " + getColor() +
                    "\nRadius is " + getRadius();
        }else{
            output = "Fan is off" +
                    "\nColor is " + getColor() +
                    "\nRadius is " + getRadius();
        }

        return output;
    }
}