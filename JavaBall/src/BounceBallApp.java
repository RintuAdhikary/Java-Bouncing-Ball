
import java.awt.*;
import javax.swing.*;

public class BounceBallApp extends JApplet {
  public BounceBallApp() {
    add(new BallControl());
    //Create new object of BallControl 
   
  }

  public static void main(String[] args) {
    BounceBallApp applet = new BounceBallApp();
    //Create an object of this class to call the constractor  
    JFrame frame = new JFrame();
    //Create an object of JFrame 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setDefaultCloseOperation() method is used to specify one of several options for the close button
    frame.setTitle("Assig_1_Base");
    //Set the title of the Jfream
    frame.add(applet, BorderLayout.CENTER);
    //Set the Layout of the Fream
    frame.setSize(400, 320);
    //set the size of the Frame
    frame.setVisible(true);
    //set the frame visible
  }
}


