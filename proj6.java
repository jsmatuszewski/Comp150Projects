
/*	Computer Science 150 - Fall 2017

      This program will determine if a word or a phrase is a palindrome. It accepts a sequence of characters consisting of only letters and blanks terminated by a period. If all th$

                To the best of our knowledge, our project works. It is complete, was submitted
        online and on time, it was written correctly, and completely.

        Authors: Marielle Krivit and Jordan Matuszewski

        Last Modified: December 4th, 2017
*/

import java.util.Scanner;
public class proj61
{
public static void main (String[]args)
        {
	char reply;
        do{
	String userInput;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a phrase or word. Add a period at the end:");
        userInput=kb.nextLine().toLowerCase();
        int size=userInput.length();
        char[] palindrome=new char[size-1];//to ignore the period
        int x=0;
        for(int i=0; i<(size-1); i++)//converts the user’s input to an array of type char
        {
	palindrome[i]=userInput.charAt(x);
        x++;
	}
	int used=palindrome.length;
        if (isPalindrome(palindrome,used)==true)
        {
	System.out.println("The phrase/word you entered is a palindrome.");
        }
	else System.out.println("The phrase/word you entered is not a palindrome.");
        System.out.println("Would you like to calculate again? Type Y or N:");//program will repeat if user wishes to continue
        reply=kb.next().charAt(0);
        }while(reply==('Y')||reply==('y'));
        }


// Returns true if the string is a palindrome and false otherwise. The array must contain letters and blanks in the positions [0] through [used-1]
        public static boolean isPalindrome(char[] a, int used)
        {
	int begin=0;
        int end=(used-1);
                if(a.length<=1)
                return true;
                else
                         {
                        int status=0;
                        for(int x=begin; x<=end;x++)
                        {
                        if(a[begin+x]==a[end-x])
                        status++;
                        }
                        if(status==a.length)
                        return true;
                        else return false;
                        }
        }

}

