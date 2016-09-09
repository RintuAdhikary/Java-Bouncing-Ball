
import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ball extends JPanel {
    //This class inherite JPanel
  private int delay = 10;
  //set the delay variable size 10

  private Timer timer = new Timer(delay, new TimerListener());
  // Initialize a new timer object with the delay and new timelistener ()
  //to run the function t a fixed interval
  private int x = 0; private int y = 0;
  //x and y variable set the corodinator
  private int radius = 5; 
  // set the ball redius
  private int dx = 2;
  private int dy = 2;

  public Ball() {
      //constactor 
    timer.start();
    //start timmer
    
  }

  private class TimerListener implements ActionListener {
      //this class inherite the ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
      repaint();
      
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
   
    super.paintComponent(g);
    //this method print the objct g
    g.setColor(Color.PINK);
//this set the color to red

    if (x < 0 || x > getWidth()) 
      dx *= -1;
    if (y < 0 || y > getHeight()) 
      dy *= -1;


    x += dx; //to make the ball move
    y += dy;
    g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
  }

  public void suspend() {
    timer.stop(); //it stop the execution
  }

  public void resume() {
    timer.start(); // it restart the execution
  }

  public void setDelay(int delay) {
    this.delay = delay;
    timer.setDelay(delay);
    //it set the delay of the scroll bar
  }
  }


