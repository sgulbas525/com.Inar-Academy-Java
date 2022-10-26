package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_21 {
    public static void main(String[] args) {
        double[][] coordinatesOfCities = getCoordinatesOfCitiesFromUser();

        double[] totalDistanceToOtherCities = getTotalDistancesToTheOtherCities(coordinatesOfCities);
        int centralCity = findTheCentralCity(totalDistanceToOtherCities);

        System.out.println("The central city is at (" +
                coordinatesOfCities[centralCity][0] + ", " + coordinatesOfCities[centralCity][1] + ")");
        System.out.printf("The total distance to all other cities is %.2f", totalDistanceToOtherCities[centralCity]);
    }

    public static double[][] getCoordinatesOfCitiesFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();

        double[][] coordinatesOfCities = new double[numberOfCities][2];
        System.out.println("Enter the coordinates of the cities: ");

        for (int city = 0; city < numberOfCities; city++) {
            coordinatesOfCities[city][0] = input.nextDouble();
            coordinatesOfCities[city][1] = input.nextDouble();

        }
        return coordinatesOfCities;
    }

    public static double[] getTotalDistancesToTheOtherCities(double[][] coordinatesOfCities) {
        double[] totalDistancesToTheOthers = new double[coordinatesOfCities.length];
        double distance;

        // Finds all city distances to each other except their own
        for (int city1 = 0; city1 < coordinatesOfCities.length; city1++) {
            distance = 0;
            for (int city2 = 0; city2 < coordinatesOfCities.length; city2++) {
                if (city2 != city1) {
                    distance += getDistance(coordinatesOfCities[city1], coordinatesOfCities[city2]);
                }
            }
            totalDistancesToTheOthers[city1] = distance;
        }
        return totalDistancesToTheOthers;
    }

    public static int findTheCentralCity(double[] totalDistanceToOtherCities) {
        double shortestDistance = totalDistanceToOtherCities[0];
        int centralCity = 0;

        // Finds the central city ---> Shortest total distances is the central city
        for (int city = 1; city < totalDistanceToOtherCities.length; city++) {
            if (shortestDistance > totalDistanceToOtherCities[city]) {
                shortestDistance = totalDistanceToOtherCities[city];
                centralCity = city;
            }
        }
        return centralCity;
    }


    public static double getDistance(double[] city1, double[] city2) {
        return Math.sqrt((city2[0] - city1[0]) * (city2[0] - city1[0]) + (city2[1] - city1[1]) * (city2[1] - city1[1]));
    }
}