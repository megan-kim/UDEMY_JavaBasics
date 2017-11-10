
package tut3.methods;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 3: Methods and Method Calls
 */
public class Methods 
{

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) 
	{
		System.out.println("Method 1 Called - no param");
		sayHelloWorld(); //Method1 call
		System.out.println();
		
		System.out.println("Method 2 called - with params");
		sayHelloTo("Charlie"); //Method with parameter called
		sayHelloTo("John");
		System.out.println();
		
		System.out.println("Method with return type");
		int x = returnFive();
		System.out.println("Method returns: " + x);
		System.out.println();
		
		System.out.println("Method call: The square of 2 numbers");
		int result = square(5);
		System.out.println("The square of 5 is: " + result);
		
	}
	
	/**
	 * New method to be called in main with no parameters 
	 */
	static void sayHelloWorld()
	{
		System.out.println("Hello World");
	}
	
	/**
	 * new method to be called in main with parameters
	 * @param name a string value entered in method call
	 */
	static void sayHelloTo(String name)
	{
		System.out.println("Hello " + name);
	}
	
	/**
	 * @return an integer value of 5
	 */
	static int returnFive()
	{
		return 5;
	}
	
	/**
	 * square(int x) -> find the square of 2 numbers
	 * @param x an integer value to be entered in method call
	 * @return the square of 2 numbers
	 */
	static int square(int x)
	{
		return x * x;
	}
	
	

}
