package chapters.chapter_09.Exercises09.E02;

public class Exercise09_02 {
    public static void main(String[] args) {
        Stock obj = new Stock("ORCL", "OracleCorporation");
        obj.previousClosingPrice = 34.5;
        obj.currentPrice = 34.35;

        System.out.printf("The price-change percentage is: %%%.2f",  obj.getChangePercent());
    }
}

