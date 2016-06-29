package sen_964.lecture_4;
import javax.swing.*; // JFrame is in javax.swing 

import java.awt.*; // Dimension is in java.awt 
public   class MyFrame_2 {
    public static void main(String[] args) {
       JFrame frame = new JFrame("Test Frame"); // Calls constructor, title is "Test Frame"

       frame.setSize(400, 300); // default size just shows title bar
    
       // get dimension of the screen
       Dimension screenSize = 
          Toolkit.getDefaultToolkit().getScreenSize(); // use toolkit to communicate with the whole system
       int screenWidth = screenSize.width;
       int screenHeight = screenSize.height; 
    
       // Locate upper-left corner (x,y) of centered frame
       int x = (screenWidth - frame.getWidth()) / 2;
       int y = (screenHeight - frame.getHeight()) / 2;

       // Set location
       frame.setLocation(x,y);  // if not set, will default to (0,0), upper left corner

       Container container = frame.getContentPane();
    JButton OKButton = new JButton ("OK");  // Creates a button, no action yet
    container.add(OKButton);          // adds the button to the container

       
       frame.setVisible(true);    // doesn't display until setVisible, allows all components to be set
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // must manually kill otherwise
    }}
