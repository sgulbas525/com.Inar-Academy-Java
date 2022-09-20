package chapters.chapter_04;

public class Exercise04_06 {
    public static void main(String[] args) {
        final double RADIUS = 40;
        double angel = Math.random() * 2 * Math.PI;
        double x1 = RADIUS * Math.cos(Math.toRadians(angel));
        double y1 = RADIUS * Math.sin(Math.toRadians(angel));
        angel = Math.random() * 2 * Math.PI;
        double x2 = RADIUS * Math.cos(Math.toRadians(angel));
        double y2 = RADIUS * Math.sin(Math.toRadians(angel));
        angel = Math.random() * 2 * Math.PI;
        double x3 = RADIUS * Math.cos(Math.toRadians(angel));
        double y3 = RADIUS * Math.sin(Math.toRadians(angel));

        System.out.println("The points are (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), and (" + x3 + ", " + y3 + ")");
    }
}