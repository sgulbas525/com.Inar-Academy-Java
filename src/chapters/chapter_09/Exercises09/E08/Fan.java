package chapters.chapter_09.Exercises09.E08;

public class Fan {
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

    public boolean getOn() {
        return on;
    }

    public String toString() {
        String output;
        if (getOn()) {
            output = "Fan speed is: " + getSpeed() +
                    "\nColor is " + getColor() +
                    "\nRadius is " + getRadius();
        } else {
            output = "Fan is off" +
                    "\nColor is " + getColor() +
                    "\nRadius is " + getRadius();
        }

        return output;
    }
}
