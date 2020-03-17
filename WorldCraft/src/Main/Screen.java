package Main;
import java.awt.Image;

import javax.swing.JFrame;

public class Screen extends JFrame {
	
	//Create a new screen
	public Screen(String title, Image icon, int sizeX, int sizeY) {
		JFrame screen = new JFrame();
		screen.setDefaultCloseOperation(EXIT_ON_CLOSE);
		screen.setSize(sizeX, sizeY);
		screen.setVisible(true);
		screen.setTitle(title);
		screen.setLayout(null);
		screen.setIconImage(icon);
	}
}
