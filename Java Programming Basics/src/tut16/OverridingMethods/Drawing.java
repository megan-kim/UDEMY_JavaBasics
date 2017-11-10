package tut16.OverridingMethods;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 16: Overriding Methods
 *  Drawing on a Frame
 */
public class Drawing extends JFrame
{

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args)
	{
		new Drawing();
	}

	//Constructor
	public Drawing()
	{
		setSize(500, 500);
		setVisible(true);
	}
	
	//Overridden Method
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawRect(50, 50, 100, 25);
		g.setColor(Color.GREEN);
		g.drawOval(250, 50, 50, 50);
		g.setColor(new Color(0,0,255));
		g.fillRect(50, 200, 100, 25);
		g.setColor(Color.BLACK);
		g.drawString("MyString" , 200, 200);
	}
}
