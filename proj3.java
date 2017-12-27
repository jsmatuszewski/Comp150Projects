import java.util.Scanner;
public class proj3
{
        public static void main (String[]args)
{
        int userNum,newNumber,thousands,hundreds,tens,ones; //newNumber will require we minimize # of operations to find each place value
        Scanner kb=new Scanner(System.in);
        char reply;                             //Will be used for do-while to allow user to run again
do{
   	System.out.println("Enter a positive integer up to 3999:");
        userNum=kb.nextInt();
        if(userNum>=0)
{
        thousands=(userNum/1000);
        newNumber=(userNum%1000);
        hundreds=(newNumber/100);
        newNumber=(newNumber%100);
        tens=(newNumber/10);
        ones=(newNumber%10);
        int x;
//Using the thousands
        if(thousands<=3)        //thousands places roman numeral output only requires one letter if at all
{
        System.out.println("The corresponding Roman Numeral is: ");
        for(x=1; thousands>=x; x++)
                System.out.print("M");
}
        else System.out.println("Roman Numerals only represent numbers up to 3999.");
//Using the hundreds
if(hundreds!=0)
{
        if(hundreds<5)
        {
                System.out.print("C");
                if(hundreds<4)
                {
                for(x=1; hundreds>x; x++)
                        System.out.print("C");
                }
                else System.out.print("D");
        }
	else
	{
                if(hundreds<9 )
                {
                System.out.print("D");
                for(x=5; hundreds>x; x++)
                        System.out.print("C");
                }
                else System.out.print("CM");
        }
}
//Using the tens
if(tens!=0)
{
        if(tens<5)
        {
                System.out.print("X");
                if(tens<4)
                {
                for(x=1; tens>x; x++)
                        System.out.print("X");
                }
                else System.out.print("L");
        }
	else
	{
                if(tens<9)
                {
                System.out.print("L");
                for(x=5; tens>x; x++)
                        System.out.print("X");
                }
                else System.out.print("XC");
        }
}
//Using the ones
if(ones!=0)
{
        if(ones<5 && ones!=0)
        {
                System.out.print("I");
                if(ones<4)
                {
                for(x=1; ones>x;x++)
                        System.out.print("I");
                }
                else System.out.print("V");
        }
	else
	{
                if(ones<9)
                {
                System.out.print("V");
                for(x=5; ones>x; x++)
                        System.out.print("I");
                }
                else System.out.print("IX");
        }

}
}
        else System.out.println("Error, negative number entered."); //if statement is at top and requires number be greater or equal to 0 (positive) thus else is negative
        System.out.println();
        System.out.println("Would you like to run the program again? Enter Y if yes, or any other key if no.");
        reply=kb.next().charAt(0);
        }while((reply==('y') || reply==('Y')));
}
}
