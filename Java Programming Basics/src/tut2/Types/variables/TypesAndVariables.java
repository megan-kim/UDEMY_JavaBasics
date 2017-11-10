
package tut2.Types.variables;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 2: Types and Variables
 */
public class TypesAndVariables
{

	/**
	 * @param args Command line arguments
	 */
	public static void main(String[] args)
	{
		System.out.println("TYPES AND VARIABLES");
		
		int var = 5; //Declare and instantiate variable (var)
		System.out.println(var);
		
		var = 10; // change variable of var
		System.out.println(var);
		
		var = var + 1; //Increment by 1
		System.out.println(var);
		
		int var2 = 7; //declare new variable
		System.out.print("var + var2 = ");
		System.out.println(var + var2); //add 2 int variables
		
		
		//Double -> Fractional value
		double x = 2.5;
		System.out.println(x);
		
		x = var; //converts int to double
		//	var = x; //INCORRECT -> Cannot convert int to double (data loss)
		System.out.println(x);
		System.out.println("___________________________________________");
		
		/* STRINGS */
		System.out.println("STRINGS");

		
		String hello = "Hello ";
		System.out.println(hello);
		
		String name = "Charlie";
		System.out.println(hello + name); //string concatenation

		
	}

}
