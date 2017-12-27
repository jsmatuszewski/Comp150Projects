/*	Computer Science 150 - Fall 2017
This program is designed to compute the pounds of green crud after a given number of days. The user indicates the initial number of pounds and number of days the crud has to reprod$
        To the best of our knowledge, our project works. It is complete, was submitted
online and on time, it was written correctly, and completely.
        Authors: Marielle Krivit and Jordan Matuszewski
        Last Modified: November 1st, 2017	*/

import java.util.Scanner;
public class proj4
{
        public static final int greenCrudGrowthRate=5;

        public static void main (String[]args)
        {
           char answer;

         do{
            	int origCrud, days2Grow;
                Scanner kb= new Scanner(System.in);
                System.out.println("Please enter the initial number of pounds of greencrud: ");
                origCrud=kb.nextInt();
                System.out.println("Enter the number of days the green crud has to reproduce: ");
                days2Grow=kb.nextInt();
                int fibIterations=(days2Grow/greenCrudGrowthRate);// to calculate the number of iterations for the specific growth rate of green crud
                System.out.println("After "+days2Grow+" days, there should be "+(fibonacci(fibIterations)*origCrud)+" pounds of green crud scumming the pond.");
                // calling the Fibonacci series method to calculate the final amount of green crud
                System.out.println("Again? Type Y or N:");
                Scanner kb2 = new Scanner(System.in);
                answer = kb2.next().charAt(0);
           }while(answer == 'y' || answer == 'Y'); // runs the program again at user’s request
                                                        public static int fibonacci(int a) // a method to calculate a Fibonacci series


        }

	public static int fibonacci(int a)
        {
	int p3=0;
        int p2=1;
        int p1=0;
        for(int x=1; x<=a; x++)
                {
                p3=p1+p2;// takes the sum of the previous two numbers
                p1=p2;
                p2=p3;// replaces the last two numbers with the next numbers and repeat
                }
        return p3;
        }
}


