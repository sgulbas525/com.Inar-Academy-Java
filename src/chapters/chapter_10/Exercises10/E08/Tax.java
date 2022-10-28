package chapters.chapter_10.Exercises10.E08;

public class Tax {
    public static int SINGlE_FILER = 0;
    public static int MARRIED_JOINTLY_QUALIFYING_WIDOWER = 1;
    public static int MARRIED_SEPARATELY = 2;
    public static int HEAD_OF_HOUSEHOLD = 3;


    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        this(SINGlE_FILER, new int[][]{
                        {8350, 33950, 82250, 171550, 372950},
                        {16700, 67900, 137050, 208850, 372950},
                        {8350, 33950, 68525, 104425, 186475},
                        {11950, 45500, 117450, 190200, 372950}},
                new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35},
                50000.0);
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax(){

        double tax = 0.0;
        int lastIndex = -1;

        if (taxableIncome <= brackets[filingStatus][0]) {
            return taxableIncome * rates[0];
        } else {
            tax += brackets[filingStatus][0] * rates[0];
            for (int i = 1; i < brackets[filingStatus].length; i++) {
                if (taxableIncome > brackets[filingStatus][i]) {
                    tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) *
                            rates[i];
                } else {
                    lastIndex = i;
                    break;
                }
            }
        }
        int lastBracket = brackets[filingStatus].length - 1;
        int lastRate = rates.length - 1;
        if (taxableIncome > brackets[filingStatus][lastBracket]) {
            tax += (taxableIncome - brackets[filingStatus][lastBracket]) *
                    rates[lastRate];
        } else {
            tax += (taxableIncome - brackets[filingStatus][lastIndex - 1]) *
                    rates[lastIndex];
        }

        return tax;
    }


    public int getFilingStatus() {
        return filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

}
