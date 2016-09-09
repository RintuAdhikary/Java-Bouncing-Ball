
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BallControl extends JPanel {
  private Ball ball = new Ball();
  //Create the Object of the Ball class 
  private JButton jbtSuspend = new JButton("Suspend");
  // Create a button suspend
  private JButton jbtResume = new JButton("Resume");
   // Create a button Resume
 
  private JScrollBar jsbDelay = new JScrollBar();
// Create a Scrollbar 
  public BallControl() {
// Default constructor
    JPanel panel = new JPanel();
    // Create a JPanel object
    panel.add(jbtSuspend);
    // adding the button suspend to the panel
    panel.add(jbtResume);
    // adding the button resume to the panel

    
    ball.setBorder(new javax.swing.border.LineBorder(Color.RED));
    // set the color of the ball as red
    jsbDelay.setOrientation(JScrollBar.HORIZONTAL);
    //Determines whether the JScrollBar is horizontal
    ball.setDelay(jsbDelay.getMaximum());
    // set the speed of the bouncing ball according to the scrollbar
    setLayout(new BorderLayout());
    // setLayout as new BorderLayout
    add(jsbDelay, BorderLayout.NORTH);
    // adding ScrollBar Layout to North
    add(ball, BorderLayout.CENTER);
    // The Ball Layout to center
    add(panel, BorderLayout.SOUTH);
    // set the pannel to south

    // Register listeners
    jbtSuspend.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        //Create action event for suspend button
          ball.suspend();
          //An object of ball call the suspend () method
        
      }
    });
    jbtResume.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
           //Create action event for Resume button
        ball.resume();
        //An object of ball call the resume () method
      }
    });
    jsbDelay.addAdjustmentListener(new AdjustmentListener() {
      public void adjustmentValueChanged(AdjustmentEvent e) {
          //Create action event for JScrollBar
        ball.setDelay(jsbDelay.getMaximum() - e.getValue());
        //set the time delay for the bouncing ball.
      }
    });
    
    
    
  }
    
  }



