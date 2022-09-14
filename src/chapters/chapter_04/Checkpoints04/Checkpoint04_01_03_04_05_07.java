package Checkpoints04;

public class Checkpoint04_01_03_04_05_07 {
    public static void main(String[] args) {
        //Checkpoint04_01
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sin(2 * Math.PI));
        System.out.println(Math.cos(2 * Math.PI));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.exp(1));
        System.out.println(Math.max(2, Math.min(3, 4)));
        System.out.println(Math.rint(-2.5));
        System.out.println(Math.ceil(-2.5));
        System.out.println(Math.floor(-2.5f));
        System.out.println(Math.round(-2.5f));
        System.out.println(Math.round(-2.5));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.round(2.5f));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(Math.abs(-2.5)));

        //Checkpoint04_03
        System.out.println("47 degree" + Math.toRadians(47) + " radian");

        //Checkpoint04_04
        System.out.println("PI / 7 is" + Math.toDegrees(Math.PI / 7) + "degrees");

        /*Checkpoint04_05
        (int)((Math.random() * 21) + 35)
        (int)(Math.random() * 999)
        ((int)(Math.random() * 500 ) + 55) / 10.0
         */

        //Checkpoint04_07
        System.out.println(Math.log(Math.exp(5.5)));
        System.out.println(Math.exp(Math.log(5.5)));
        System.out.println(Math.asin(Math.sin(Math.PI / 6)));
        System.out.println(Math.sin(Math.asin(Math.PI / 6)));
    }
}
