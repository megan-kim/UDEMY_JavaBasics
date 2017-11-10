
package tut8.UsingObjects.CreatingAWindow;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 8: Using objects to Create a Window
 */

public class Objects
{

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args)
	{
		//JFrame object created
		JFrame window = new JFrame();
		
		//Object method calls to configure window object
		window.setSize(400, 600);
		window.setTitle("My Window");
		window.setVisible(true);
		
		//add a label to the window
		JLabel lbl = new JLabel();
		lbl.setText("My Label");
		
		//Add JLabel object to window (JFrame object)
		window.add(lbl);
		
    }
}