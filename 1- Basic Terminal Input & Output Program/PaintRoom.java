

import java.util.Scanner;


public class PaintRoom {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.print ("Enter the length of the room in feet: ");
        double length= input.nextDouble ();

System.out.print ("Enter the width of the room in feet: ");
        double width = input.nextDouble ();

System.out.print ("Enter the height of the room in feet: ");
        double height = input.nextDouble ();

double area = 2 * height * (length + width);
double gallons = area / 350 ;

System.out.printf ("You will need %.2f gallons of paint. \n", gallons) ;

    }
}

