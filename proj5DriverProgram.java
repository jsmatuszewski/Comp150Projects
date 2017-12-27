/*	Computer Science 150 - Fall 2017

     The purpose of this program is to function as a bank that will allow the user to put in their initial balance, make deposits, and withdrawals as many times as they would like.

        Authors: Marielle Krivit and Jordan Matuszewski
        Last Modified: November 13th, 2017
*/
import java.util.*;
public class proj5
{
public static void main (String[]args)
        {
           char reply;
        BankAccount sample= new BankAccount();
        Scanner kb=new Scanner(System.in);
        System.out.println("Welcome to Jordan's Bank!");
        System.out.println("Please enter the balance of your bank account:");
        double balance= kb.nextDouble();
        sample.setBalance(balance);
        do{
           	System.out.println("Select one of the following choices: \n d (Make a deposit) \n w (Make a Withdrawl)\n s (Display Balances) \n q (Quit)");
                char request=kb.next().charAt(0);
                if(request==('d')||request==('D'))// request to deposit
                {
                System.out.println("Enter the amount you'd like to deposit.");
                double DepAmnt=kb.nextDouble();
                sample.deposit(DepAmnt);
                }
                if(request==('w')||request==('W'))// request to withdraw
                {
                System.out.println("Enter the amount you'd like to withdraw.");
                double withAmnt=kb.nextDouble();
                if((sample.getBalance()-withAmnt)<0)// user cannot withdraw more than
                                                        // they have in their balance

                {
                System.out.println("Error, you may not have a negative balance.");
                }
                else sample.withdraw(withAmnt);
                }
                if(request==('s')||request==('S'))// request to print balance
                {sample.printBalance();}
                if(request==('q')||request==('Q'))//request to quit
                {
                System.out.println("Your current account balance is:");
                System.out.println("$"+sample.getBalance());
                System.out.println("Thank you for your business.");
                System.exit(0);
                }
                System.out.println("Would you like to make another transaction? Enter Y if yes, N if no.");
                reply=kb.next().charAt(0);
                }while(reply==('y')||reply==('Y'));// program will repeat as user desires
                if (reply==('n')||reply==('N'))
                {System.out.println("Balance of your accounts with Jordan's Bank:");
                System.out.println("$"+sample.getBalance());
                System.out.println("Thank you for your business.");}
        }
}
