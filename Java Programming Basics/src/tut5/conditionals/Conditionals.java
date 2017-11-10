
package tut5.conditionals;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 5: Conditionals
 */public class Conditionals 
 {

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) 
	{
		System.out.println("If statement");
		/* If statement 
		 *   if (Condition = true)
		 *   {
		 * 		//Execute code
		 *   }
		 */
		
		if(true) //false condition doesn't execute
		{
			System.out.println("Hello");
		}
		System.out.println();
		
		boolean sayHello = false;
		boolean sayGoodbye = false;
		boolean sayHey = true;
		
		System.out.println("If else statement");
		/* If else statement 
		 *   if (Condition = true)
		 *   {
		 * 		//Execute code
		 *   }
		 *   else
		 *   {
		 *   	//execute if condition = false
		 *   }
		 */
		
		if (sayHello)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("goodbye");
		}
		System.out.println();
		
		
		/* 
		 * = - assignment operator
		 * CONDITIONAL OPERATORS
		 * > - greater than
		 * < - less than
		 * >= - greater than or equal to
		 * <= - less than or equal to
		 * != - not equal to
		 * == - is equal to
		 * 
		 * LOGICAL OPERATORS
		 * && - and
		 * || - or
		 */
		
		System.out.println("Logical operator example");
		//e.g. in a video game find out if the player is still on the field
		int playerX = 50;
		if (playerX < 0 || playerX > 800)
		{
			System.out.println("Player is not on the field, \n change direction");
		}
		else
		{
			System.out.println("Player is on the field, make a legal move");
		}
		System.out.println();
		
		/* If.. else if... else statement 
		 * FIRST TRUE STATEMENT ONLY IS EXECUTED (OR FALSE STAEMENT)
		 *   if (Condition = true)
		 *   {
		 * 		//Execute code
		 *   }
		 *   else if
		 *   {
		 *   	//execute if condition is true
		 *   }
		 *   else
		 *   {
		 *   	 //execute if condition is false
		 *   }
		 */
		
		System.out.println(" If.. else if... else statement");
		if (sayHello)
		{
			System.out.println("Hello");
		}
		else if (sayHey)
		{
			System.out.println("Hey");
		}
		else
		{
			System.out.println("Goodbye");
		}
	}

}
