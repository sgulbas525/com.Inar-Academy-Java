package chapters.chapter_09.Exercises09.E02;

public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    public double getChangePercent() {
        double change = currentPrice - previousClosingPrice;
        return (change / previousClosingPrice) * 100.0;
    }


}
