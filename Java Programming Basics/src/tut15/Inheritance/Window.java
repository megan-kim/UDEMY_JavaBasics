/**
 * 
 */
package tut15.Inheritance;

import javax.swing.JFrame;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 15: Inheritance
 * Window GUI class
 */
public class Window extends JFrame
{

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) 
	{
		new Window(); //Call Constructor
	}
	
	//Constructor
	public  Window()
	{
		setSize(500, 500);
		setVisible(true);
		setTitle("My Window");		
	}
			

}
