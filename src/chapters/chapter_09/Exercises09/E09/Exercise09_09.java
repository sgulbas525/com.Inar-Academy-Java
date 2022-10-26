package chapters.chapter_09.Exercises09.E09;

import chapters.chapter_09.Exercises09.E09.RegularPolygon;

public class Exercise09_09 {
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6, 4);
        RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("r1's perimeter is " + r1.getPerimeter() +
                " and it's area is " + r1.getArea());
        System.out.println("r2's perimeter is " + r2.getPerimeter() +
                " and it's area is " + r2.getArea());
        System.out.println("r3's perimeter is " + r3.getPerimeter() +
                " and it's area is " + r3.getArea());
    }
}

