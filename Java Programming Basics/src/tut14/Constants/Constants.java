
package tut14.Constants;

import tut9.ClassesAndObjects.Person;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 14: Using Constants in Programs
 */

public class Constants 
{

	//Global Variables (Constants)
	public static final int WIDTH = 800;
	public static final int HEIGHT = 400;
	
	//Refers to the same object all the time
	public static final Person P1 = new Person("Joan");
	
	/* Naming Convention: 
	 * ALL_CAPS
	 * Underscores between words
	 */
	public static final int NUM_ENEMIES = 5;
	
	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args)
	{
		System.out.println("PI = "  + Math.PI);
		System.out.println("Width: " + Constants.WIDTH);
		System.out.println("Person Name: "  + P1.getName());
	}

}
