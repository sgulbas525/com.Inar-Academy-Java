package weeks.week_13;

public class Home {
    private double squareFeet;
    private int numberOfBaths;
    private int numberOfRooms;
    private boolean hasAnyGarage;
    private double price;
    private double rent;
    private String direction;
    private int year;

    public Home() {
        this(0, 0, 0, false, 0, 0, null, 0);
    }

    public Home(double squareFeet, int numberOfBaths, int numberOfRooms, boolean hasAnyGarage,
    double price, double rent, String direction, int year){
        this.squareFeet = squareFeet;
        this.numberOfBaths = numberOfBaths;
        this.numberOfRooms = numberOfRooms;
        this.hasAnyGarage = hasAnyGarage;
        this.price = price;
        this.rent = rent;
        this.direction = direction;
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasAnyGarage() {
        return hasAnyGarage;
    }

    public void setHasAnyGarage(boolean hasAnyGarage) {
        this.hasAnyGarage = hasAnyGarage;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public void setNumberOfBaths(int numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }
}
