package q8;


public class Tax {
    public static int SINGLE_FILER = 0;
    public static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static int MARRIED_SEPARATELY = 2;
    public static int HEAD_OF_HOUSEHOLD = 3;


    private int filingStatus;
    int[][] brackets;
    double[] rates;
    double taxableIncome;

    Tax() {
        filingStatus = SINGLE_FILER;
        double[] currentYearRates = {10, 15, 25, 28, 33, 35};
        ;
        setRates(currentYearRates);
        int[][] currentYearBrackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        setBrackets(currentYearBrackets);
        taxableIncome = 0;
    }

    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        setFilingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rates);
        setTaxableIncome(taxableIncome);
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public static int getSingleFiler() {
        return SINGLE_FILER;
    }

    public static int getMarriedJointlyOrQualifyingWidow() {
        return MARRIED_JOINTLY_OR_QUALIFYING_WIDOW;
    }

    public static int getMarriedSeparately() {
        return MARRIED_SEPARATELY;
    }

    public static int getHeadOfHousehold() {
        return HEAD_OF_HOUSEHOLD;
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

    public static void setSingleFiler(int singleFiler) {
        SINGLE_FILER = singleFiler;
    }

    public static void setMarriedJointlyOrQualifyingWidow(int marriedJointlyOrQualifyingWidow) {
        MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = marriedJointlyOrQualifyingWidow;
    }

    public static void setMarriedSeparately(int marriedSeparately) {
        MARRIED_SEPARATELY = marriedSeparately;
    }

    public static void setHeadOfHousehold(int headOfHousehold) {
        HEAD_OF_HOUSEHOLD = headOfHousehold;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = new int[brackets.length][brackets[0].length];
        for (int i = 0; i < brackets.length; i++) {
            for (int j = 0; j < brackets[i].length; j++)
                this.brackets[i][j] = brackets[i][j];
        }
    }

    public void setRates(double[] rates) {
        this.rates = new double[rates.length];
        for (int i = 0; i < rates.length; i++)
            this.rates[i] = rates[i] / 100;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0, incomeTaxed = 0;
        double income = taxableIncome;
        if (rates.length >= 2) {
            for (int i = rates.length - 2; i >= 0; i--) {
                if (income > brackets[filingStatus][i]) {
                    tax += (incomeTaxed = income - brackets[filingStatus][i]) * rates[i + 1];
                    income -= incomeTaxed;
                }
            }
        }
        return tax += brackets[filingStatus][0] * rates[0];
    }
}
