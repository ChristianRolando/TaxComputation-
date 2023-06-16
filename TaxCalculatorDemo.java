package variables;

public class TaxCalculatorDemo {
		
		public static void main(String[] args) {
			
		    // Testing the basic rate computation.
		    double itemPrice = 10.00;
		    System.out.println("Item price no tax: " + itemPrice);
		    System.out.println("cost with 4% tax: " + TaxCalculator.computeCostBasic(itemPrice));

		    // Change basic rate to 7.5%
		    TaxCalculator.changeBasicRateTo(0.075);

		    System.out.println("\nTesting the basic rate computation.");
		    System.out.println("Item price no tax: " + itemPrice);
		    System.out.println("cost with 7.5% tax: " + TaxCalculator.computeCostBasic(itemPrice));

		    // Testing the luxury rate computation.
		    double itemPriceLuxury = 2019.25;
		    System.out.println("\nTesting the luxury rate computation.");
		    System.out.println("Item price no tax: " + itemPriceLuxury);
		    System.out.println("cost with 10% tax: " + TaxCalculator.computeCostLuxury(itemPriceLuxury));

		    // Change luxury rate to 20%
		    TaxCalculator.changeLuxuryRateTo(0.2);

		    System.out.println("\nTesting the luxury rate computation.");
		    System.out.println("Item price no tax: " + itemPriceLuxury);
		    System.out.println("cost with 20% tax: " + TaxCalculator.computeCostLuxury(itemPriceLuxury));

		    // Testing the basic rate again, should still be 7.5%
		    double itemPriceBasicAgain = 210.99;
		    System.out.println("\nTesting the basic rate again, should still be 7.5%");
		    System.out.println("Item price with no tax: " + itemPriceBasicAgain);
		    System.out.println("cost with 7.5% tax: " + TaxCalculator.computeCostBasic(itemPriceBasicAgain));
		


	}

}
