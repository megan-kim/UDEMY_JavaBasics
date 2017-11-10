
package tut15.Inheritance;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 15: Inheritance
 * Child Class (SubClass)
 */
public class Child extends Parent //'extends' => Inheritance Keyword
{

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args)
	{
		Child c = new Child();
		System.out.println(c.eyeColor);
	}

}
