package sen_964.lecture_4;
import javax.swing.*; // JFrame is in javax.swing 

import java.awt.*; // Dimension is in java.awt 

public class MyFrame_1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Frame"); // Calls constructor, title is
													// "Test Frame"

		frame.setSize(400, 300); // default size just shows title bar

		// get dimension of the screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		// Locate upper-left corner (x,y) of centered frame
		int x = (screenWidth - frame.getWidth()) / 2;
		int y = (screenHeight - frame.getHeight()) / 2;

		// Set location
		frame.setLocation(x, y); // if not set, will default to (0,0), upper
									// left corner

		frame.setVisible(true); // doesn't display until setVisible, allows all
								// components to be set
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // must manually
																// kill
																// otherwise
	}
}
