public class Exercise04_03 {
    public  static  void  main(String[] args){
        final double RADIUS = 6371.01;
        double chaX = 35.227085;
        double chaY = - 80.843124;
        double ataX = 33.753746;
        double ataY = - 84.386330;
        double floX = 27.994402;
        double floY = - 81.760254;
        double savX = 32.076176;
        double savY = - 81.088371;

        double dCA = RADIUS * Math.acos(Math.sin(Math.toRadians(chaX)) * Math.sin(Math.toRadians(ataX)) + Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(ataX)) * Math.cos(Math.toRadians(chaY - ataY)) );
        double dCF = RADIUS * Math.acos(Math.sin(Math.toRadians(chaX)) * Math.sin(Math.toRadians(floX)) + Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(floX)) * Math.cos(Math.toRadians(chaY - floY)) );
        double dCS = RADIUS * Math.acos(Math.sin(Math.toRadians(chaX)) * Math.sin(Math.toRadians(savX)) + Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(chaY - savY)) );
        double dAF = RADIUS * Math.acos(Math.sin(Math.toRadians(ataX)) * Math.sin(Math.toRadians(floX)) + Math.cos(Math.toRadians(ataX)) * Math.cos(Math.toRadians(floX)) * Math.cos(Math.toRadians(ataY - floY)) );
        double dAS = RADIUS * Math.acos(Math.sin(Math.toRadians(ataX)) * Math.sin(Math.toRadians(savX)) + Math.cos(Math.toRadians(ataX)) * Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(ataY - savY)) );
        double dFS = RADIUS * Math.acos(Math.sin(Math.toRadians(floX)) * Math.sin(Math.toRadians(savX)) + Math.cos(Math.toRadians(floX)) * Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(floY - savY)) );


        double s1 = (dCA + dAS + dCS) / 2;
        double area1 = Math.sqrt(s1 * (s1 - dCA) * (s1 - dAS) * (s1 - dCS));

        double s2 = (dFS + dAF + dAS) / 2;
        double area2 = Math.sqrt(s2 * (s2 - dAS) * (s2 - dAF) * (s2 - dFS));

        double totalArea = area1 + area2;

        System.out.println("Area between 4 states is " + totalArea + "km" );
    }
}

