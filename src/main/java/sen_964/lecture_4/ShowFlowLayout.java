package lecture_4;
// ShowFlowLayout.java: Demonstrate using FlowLayout

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame {
  /** Default constructor */
  public ShowFlowLayout() {
    // Get the content pane of the frame
    Container container = getContentPane();

    // Set FlowLayout, aligned left with horizontal gap 30
    // and vertical gap 40 between components
    container.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));

    // Add buttons to the frame
    for (int i = 1; i <= 10; i++)
      container.add(new JButton("Component " + i));
  }

  /** Main method */
  public static void main(String[] args) {
    ShowFlowLayout frame = new ShowFlowLayout();
    frame.setTitle("Show FlowLayout");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 200);
    frame.setVisible(true);
  }
}
