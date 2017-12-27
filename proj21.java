/*The purpose of this program is to collect
3 non negative numbers from the user,
and to sort them from lowest to highest.*/
import java.util.Scanner;
public class proj21

{
        public static void main (String[]args)
        {
	int firstNum, secondNum, thirdNum; //Each Integer must be stored seperately in order to compare them.
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter your first nonnegative number: ");
        firstNum=keyboard.nextInt();
        System.out.println("Enter your second nonnegative number: ");
        secondNum=keyboard.nextInt();
        System.out.println("Enter your third nonnegative number: ");
        thirdNum=keyboard.nextInt();

        if(firstNum<secondNum && firstNum<thirdNum)
        /*This if statement will first determine if the firstNum is the lowest,
        then a nested if-else statement will compare the 2 remaining number*/
        {	System.out.print(firstNum);
                if(secondNum<thirdNum)
                System.out.print(","+secondNum+","+thirdNum);
                else System.out.println(","+thirdNum+","+secondNum);
                /*The reason this else statement can be executed with confidence is because if the
                if statement was initiated, the firstNum must be the smallest, and if secondNum is
                not smaller than third, thirdNum  must be smaller than secondNum*/
        }
	if(secondNum<firstNum && secondNum<thirdNum)
        {	System.out.print(secondNum);
                if(firstNum<thirdNum)
                System.out.print(","+firstNum+","+thirdNum);
                else System.out.print(","+thirdNum+","+firstNum);
        }

	if(thirdNum<firstNum && thirdNum<secondNum)
        {	System.out.print(thirdNum);
                if(firstNum<secondNum)
                System.out.print(","+firstNum+","+secondNum);
                else System.out.print(","+secondNum+","+firstNum);
        }

}
}




