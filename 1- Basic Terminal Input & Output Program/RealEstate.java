

import java.util.Scanner;


public class RealEstate {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.print ("Enter the current price of the house: ");
        double currentPrice = input.nextDouble ();

System.out.print ("Enter the price of the house last month: ");
double lastMonthPrice = input.nextDouble ();

double priceChange = currentPrice - lastMonthPrice;
double monthlyPayment = (0.051* currentPrice)/12;

System.out.printf ("The current price is $%.2f\n", currentPrice);
System.out.printf ("The price change is $%.2f\n", priceChange);
System.out.printf ("The estimated monthly mortgage payment is S$%.2f\n", monthlyPayment);
    }
}

