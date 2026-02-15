import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RadioButtonDisplay extends JFrame
{
    JRadioButton happy_btn,sad_btn,surprive_btn,angry_btn;
    JLabel label;
  RadioButtonDisplay()
  {
   setTitle("Emoji Display");
   setSize(300,400);
   setLayout(BorderLayout());
    JPanel leftPanel=new JPanel();
    
   


   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(true);
  }
}
class RadioButtonImage
{
    public static void main(String[] args) 
    {
        new RadioButtonDisplay();
    }
}