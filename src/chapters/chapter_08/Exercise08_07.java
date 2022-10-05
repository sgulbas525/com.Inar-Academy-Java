package chapters.chapter_08;

public class Exercise08_07 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        displayTheNearestTwoPoints(points);
    }

    public static double[][] getPoints() {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        return points;
    }

    public static void displayTheNearestTwoPoints(double[][] points) {
        double[][] nearestTwoPoints = getTheNearestTwoPoints(points);

        System.out.println("The nearest points are (" +
                nearestTwoPoints[0][0] + ", " + nearestTwoPoints[0][1] + ", " + nearestTwoPoints[0][2] + ") " +
                "and (" + nearestTwoPoints[1][0] + ", " + nearestTwoPoints[1][1] + ", " + nearestTwoPoints[1][2] + ")");
    }
//Mat.sqrt(2(x2 - x1)2 + (y2 - y1)2 + (z2 - z1)2, 2).
    public static double[][] getTheNearestTwoPoints(double[][] points) {
        double[][] nearestTwoPoints = new double[2][3];
        double distance = Double.MAX_VALUE;

        for (int point1 = 0; point1 < nearestTwoPoints.length - 1; point1++) {
            for (int point2 = point1 + 1; point2 < nearestTwoPoints[point1].length; point2++) {
                if(getDistance(points[point1], points[point2]) < distance){
                    nearestTwoPoints[0] = points[point1];
                    nearestTwoPoints[1] = points[point2];
            }
        }
        }
return nearestTwoPoints;
    }

    public static double getDistance(double[] point1, double[] point2) {
        double distance = Math.sqrt((point2[0] - point1[0]) * (point2[0] - point1[0]) +
                (point2[1] - point1[1]) * (point2[1] - point1[1]) +
                (point2[2] - point1[2]) * (point2[2] - point1[2]));

        return distance;
    }
}
