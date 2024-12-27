

import java.util.Scanner;


public class IntFloat {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.print ("Enter the first integer: ");
        int num1 = input.nextInt ();

System.out.print ("Enter the second integer: ");
        int num2 = input.nextInt ();

System.out.print ("Enter the third integer: ");
        int num3 = input.nextInt ();

System.out.print ("Enter the fourth integer: ");
        int num4 = input.nextInt ();

int productInt  = num1 * num2 * num3 * num4;
double productFloat =(double) (num1 * num2 * num3 * num4) ;

int averageInt  = (num1 + num2 + num3 + num4) / 4;
double averageFloat =(double) (num1 + num2 + num3 + num4) / 4;

System.out.println ("integer arthimetic: " + productInt + " " + averageInt);
System.out.printf ("floating point arthimetic: %.3f  %.3f\n" , productFloat,averageFloat );



    }
}

