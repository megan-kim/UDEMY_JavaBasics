/**
 * 
 */
package tut4.VariableScope;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 4: Variable Scope
 */

public class VariableScope
{

	//Class Variables (in scope to all methods in class)
	static int x;
	
	/**
	 * @param args command line arguments
	 */
	
	public static void main(String[] args) 
	{
		System.out.println("This class is just for explanation,\n has no output!");
		x = 5; //only = 5 in main()
	}
	
	static void doSomething()
	{
		x = 10; // only = 10 in doSomething()
	}
	
	static void doSomethingLocally()
	{
		//This variable is only accessible by this method
		int y = 100;
	}

}

 