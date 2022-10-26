package chapters.chapter_09.Exercises09;

public class Exercise09_02 {
    public static void main(String[] args) {
        Stock obj = new Stock("ORCL", "OracleCorporation");
        obj.previousClosingPrice = 34.5;
        obj.currentPrice = 34.35;

        System.out.printf("The price-change percentage is: %%%.2f",  obj.getChangePercent());
    }
}

class Stock {
    public String symbol;
    public String name;
    public  double previousClosingPrice;
    public double currentPrice;

    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    public double getChangePercent(){
        double change = currentPrice - previousClosingPrice;
        return (change / previousClosingPrice) * 100.0;
    }


}
