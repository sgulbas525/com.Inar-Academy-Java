package weeks.week_15.myException;

public class Coffee {

    private String type;
    private int temp;

    public Coffee(int temp) {
        this("Regular", temp);
    }

    public Coffee(String type, int temp) {
        this.type = type;
        this.temp = temp;
    }

    public String getType() {
        return type;
    }

    public int getTemp() {
        return temp;
    }
}