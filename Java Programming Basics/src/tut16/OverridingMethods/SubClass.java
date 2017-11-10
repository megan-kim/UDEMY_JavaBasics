/**
 * 
 */
package tut16.OverridingMethods;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 16: Overriding Methods
 *  SubClass
 */
public class SubClass extends Base
{

	/**
	 * @param args command Line arguments
	 */
	public static void main(String[] args)
	{
		SubClass sc = new SubClass();
	}

	//Constructor
	public SubClass()
	{
		sayHello(); //Calling method defined in base
	}
	
	
	@Override
	public void sayHello()
	{
		
		super.sayHello();
		System.out.println("Overridden Method");
		System.out.println("Hi");
	}
}
