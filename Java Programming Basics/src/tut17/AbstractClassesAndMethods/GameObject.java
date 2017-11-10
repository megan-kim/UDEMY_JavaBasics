
package tut17.AbstractClassesAndMethods;

/**
 * @author Megan K. Chinian (@kim_the_coder)
 * @version 1.0
 * Udemy: Java Programming Basics
 * Tutorial 17: Abstract Classes
 *  Drawing on a Frame
 */
public abstract class GameObject 
{
	//Abstract classes exist to be extended

	/**
	 * @param args Command line arguments
	 */
	public static void main(String[] args) 
	{
		Player p = new Player();
		p.Draw();
		
		Menu menu = new Menu();
		menu.Draw();
		
		GameObject player = new Player();
		player.Draw();
		
		GameObject[] gameObjects = new GameObject[2];
		gameObjects[0] = player;
		gameObjects[1] = menu;
		
		for(GameObject obj: gameObjects)
		{
			obj.Draw();
		}
	}
	
	//Abstract class
	public abstract void Draw();

}
