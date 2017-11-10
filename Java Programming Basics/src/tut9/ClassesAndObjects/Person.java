package tut9.ClassesAndObjects;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 9: Classes and Objects 
 * Person class
 */

public class Person 
{
	String name;
	int age;
	
	
	/**
	 * no - args constructor
	 */
	public Person()
	{
		System.out.println("Person Created");
	}
	
	/**
	 * Parameterized constructor
	 * @param name a String value for person's name
	 */
	public Person(String name)
	{
		this.name = name;
		System.out.println("Person created");
	}

	
	//Getters and Setters
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	/**
	 * method sayHelloTo() allows one person to say hello to another
	 * @param person the person being greeted
	 */
	public void sayHelloTo(Person person)
	{
		System.out.println(getName() + " said hello to " + person.getName());
	}
	
}
