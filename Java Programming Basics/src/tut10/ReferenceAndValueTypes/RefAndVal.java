/**
 * 
 */
package tut10.ReferenceAndValueTypes;

import tut9.ClassesAndObjects.Person;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 10: Reference and Value types explained
 */
public class RefAndVal
{

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) 
	{
		/* VALUE - bytes, short, int, long, float, double, boolean, char */
		int x = 5;
		addOneTo(x);
		System.out.println(x);
		
		/* REFERENCE - String, Person, Label, ClassName */
		Person john;
		john = new Person("John");
		john.setAge(33);
		celebrateBirthday(john);
		
	}

	private static void celebrateBirthday(Person person)
	{
		person.setAge(person.getAge() + 1);
		System.out.println("You're one year older");
	}

	private static void addOneTo(int num) 
	{
		num = num + 1;
	}

}
