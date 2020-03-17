package Main;

import java.awt.Color;
import java.awt.Image;

public class WorldCraft {
	
	private static Screen screen;
	
	public static void main(String[] args) {
		drawScreen("WorldCraft", null, 800, 500);
		initGame();
	}
	
	//Call the Screen script and create a new screen 
	//arguments: title, icon, sizeX, sizeY
	public static void drawScreen(String title, Image icon, int sizeX, int sizeY) 
	{
		
		screen = new Screen(title, icon, sizeX, sizeY);
		
	}
	
	//Gets the generated screen on the method "drawScreen"
	public static Screen getScreen() 
	{
		
		return screen;
		
	}

	private static void initGame() 
	{
		
		System.out.println("Stating game...");
		
	}
	
}
