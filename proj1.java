import java.util.Scanner;
public class proj1

{
        public static void main (String []args)
        {
	double thisMonths, outStanding,interestPaid,principalPaid,outStandingLeft;
        Scanner keyboard= new Scanner (System.in);
        System.out.println("What is this months payment?");
        thisMonths=keyboard.nextInt();
        System.out.println("Whats is the outstanding balance?");
        outStanding=keyboard.nextInt();
        System.out.println("Here is a breakdown of the payment: ");
        interestPaid=(((outStanding*1.0625)-outStanding)/12); //Would this only work the first year?
        System.out.println("Amount put toward interest: $"+interestPaid);
        principalPaid=(thisMonths-interestPaid);
        System.out.println("Amount applied to principal:  $"+principalPaid);
        outStandingLeft=(outStanding-(thisMonths-interestPaid));
        System.out.println("After the payment the account balance is: $"+outStandingLeft);
        }
}




