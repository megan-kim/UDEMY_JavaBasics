
package tut13.Arrays;

import java.util.Iterator;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 13: Arrays demonstrated
 */

public class Arrays
{

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) 
	{
		//1 Box to store 1 int value
		int x = 5;
		
		//Declare an int array
		int[] myArray;
		//initialize the array
		myArray = new int[4];
		
		//Assign values to the array (populate the array)
		myArray[0] = 5;
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1;
		
		//Print out a specific value within the array 
		System.out.println(myArray[1]);
		System.out.println();
		
		//Iterating over an array
		System.out.println("Iterating over an array");
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println(myArray[i]);
		}
		System.out.println();
		
		//Iterating over a collection
		System.out.println("Iterating over a collection");
		for(int num: myArray)
		{
			System.out.println(num);
		}
		System.out.println();
		
		System.out.println("Populate array using a for loop");
		myArray = new int[50000];
		//Populate array using for loop
		for (int counter = 0; counter < 50000; counter++) 
		{
			myArray[counter] = counter;
			System.out.println(counter);
		}
		System.out.println();
		
		//init and populate array directly
		myArray = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println("Directly initialize and populate array");
		System.out.println(myArray[2]);
	}

}
