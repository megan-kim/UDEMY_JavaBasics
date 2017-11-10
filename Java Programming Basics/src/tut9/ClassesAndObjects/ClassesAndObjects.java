
/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 9: Working with Classes and Objects
 */
package tut9.ClassesAndObjects;

public class ClassesAndObjects 
{

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) 
	{
		//Constructor with no param
		Person john = new Person();
		john.name = "John";
		john.age = 21;
		System.out.println(john.name + " is " + john.age + " years old");
		System.out.println();
		
		//Constructor with string parameter
		Person jack = new Person("Jack");
		jack.getName();
		jack.setAge(23);
		System.out.println(jack.getName() + " is " + jack.getAge() + " years old");
		System.out.println();
		
		john.sayHelloTo(jack);
	}

}
