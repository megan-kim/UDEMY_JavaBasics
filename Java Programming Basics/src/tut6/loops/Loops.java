package tut6.loops;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 6: Loops
 */

public class Loops 
{
 
	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) 
	{
		System.out.println("While loop output");
		whileLoop();
		System.out.println();
		
		System.out.println("Do...While loop output");
		doWhileLoop();
		System.out.println();
		
		System.out.println("For loop output");
		forLoop();
		
	}
	
	/* 1. While Loop
	 * while(condition = true)
	 *  {
	 *  	//execute code
	 *  }
	 */
	static void whileLoop()
	{
		int counter = 0;
		while(counter < 5)
		{
			counter++;
			System.out.println(counter);
		}
	}
	
	/* 2. Do... While Loop
	 *    do
	 *    { 
	 *      //code to execute
	 *    }while(condition = true)
	 */
	static void doWhileLoop()
	{
		int counter = 0;
		do{
			counter++;
			System.out.println(counter);
		  }while(counter < 10);
	}
	
	/* 3. For Loop
	 * counter => c 
	 *  for (initialize counter; condition to be true; iterate)
	 *  {
	 *  	//code to execute
	 *  }
	 */
	static void forLoop()
	{
		for(int c = 0; c < 7; c++)
		{
			System.out.println(c);
		}
	}
	
	
}
