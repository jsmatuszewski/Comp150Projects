import java.util.*;
public class BankAccount
{

        private double balance;
        // Constructor method: used to set up a BankAccount object
        public BankAccount()
        {balance = 0.0;}
        public double getBalance()
        {
	return balance;
        }
	public void printBalance()
        {
	System.out.println("Your current account balance is:");
        System.out.println("$"+getBalance());
        }
	// Mutator methods: used to set, add to, or subtract from the balance
        public void setBalance(double b)
        {
	balance = b;
        }
	public void deposit(double amount)
        {
	double newBal=getBalance()+amount;
        setBalance(newBal);
        }
	public void withdraw(double amount)
        {
	double newBal=getBalance()-amount;
        setBalance(newBal);
        }

}


