package variables;

public class TaxCalculator {
    private static double basicRate = 0.04;
    private static double luxuryRate = 0.10;

    private TaxCalculator() {}

    public static double computeCostBasic(double price) {
        return price * (1 + basicRate);
    }

    public static double computeCostLuxury(double price) {
        return price * (1 + luxuryRate);
    }

    public static void changeBasicRateTo(double newRate) {
        basicRate = newRate;
    }

    public static void changeLuxuryRateTo(double newRate) {
        luxuryRate = newRate;
    }
}
