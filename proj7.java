/*	Computer Science 150 - Fall 2017

      This program consists of a method titled bubbleSort that performs a bubble sort of an array. It examines all adjacent pairs of elements in the array from beginning to end and$

        Authors: Marielle Krivit and Jordan Matuszewski
        Last Modified: December 4th, 2017
*/
public class proj62
{
public static void main(String[]args) //A driver main method to test bubbleSort
        {

	int[]testlist={9,8,7,6,5,4,3,2,1,9,0,8,9};
        bubbleSort(testlist);
        for(int x=0; x<testlist.length;x++)
        {
	System.out.println(testlist[x]);
        }
	}

//sorts an array by examining two adjacent elements at a time, interchanging them if they’re out of order, and working from beginning to end
   public static void bubbleSort(int[] a)
        {
	for(int count=0; count<a.length;count++)
        {
	for(int index=0; index<a.length-1; index++)
                {
                if(a[index]>a[index+1])
                {
                int big=a[index];
                a[index]=a[index+1];
                a[index+1]=big;//original value of a[index]
                }
                }
        }
}


}

