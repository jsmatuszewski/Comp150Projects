/*This program asks a user for the value of a temperature they'd like to convert to Celsius or Fahrenheit, and if they enter the wrong label, an error message occurs*/
import java.util.Scanner;
public class proj22
{
        public static void main(String[]args)
        {
	double original,converted;//Double is necessary in order for accurate conversions, otherwise int will not allow for remainders.
        String origLabel;
        Scanner kb= new Scanner(System.in);
        System.out.println("Please enter the temperature that you'd like to convert.(No Label Needed)");
        original=kb.nextDouble();
        System.out.println("Please enter either F for Fahrenheit or C for Celsius to denote the unit of the value you entered.");
        String junk=kb.nextLine();//Junk string is necessary to store the cursor movement.
        origLabel=kb.nextLine();

        if(origLabel.equalsIgnoreCase("f")) //If the user is converting from Farhenheit, F or f will equally "f" when ignoring case and initiate the statement.
        {
                converted=(5*(original-32)/9);
                System.out.println(original+" Degrees Fahrenheit in degrees Celsius is: "+converted);
        }
	if(origLabel.equalsIgnoreCase("c"))
        {
                converted=(9*(original)/5)+32;
                System.out.println(original+" Degrees Celsius in degrees Fahrenheit is: "+converted);
        }
	if(!(origLabel.equalsIgnoreCase("c")) && !(origLabel.equalsIgnoreCase("f"))) //If the user enters a letter value that is not a c or an f this will cause the error message.
                System.out.println("Error, did you enter F or C properly?.");
        }
}

