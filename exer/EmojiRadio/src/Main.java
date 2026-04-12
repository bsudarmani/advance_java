import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class EmojiRadio extends JFrame implements ActionListener
{
    JRadioButton happy_btn,sad_btn,angry_btn,surprise_btn;
    JLabel label;
  EmojiRadio() {
      setTitle("Emoji Selection");
      setSize(600, 400);
      setLayout(new BorderLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);

      //left panel
      JPanel leftpanel = new JPanel();
      leftpanel.setLayout(new GridLayout(4, 1));
      leftpanel.setBorder(BorderFactory.createTitledBorder("select emotion"));

      sad_btn = new JRadioButton("sad");
      happy_btn = new JRadioButton("happy");
      angry_btn=new JRadioButton("angry");
      surprise_btn=new JRadioButton("surprise");

      ButtonGroup bg=new ButtonGroup();
      bg.add(sad_btn);
      bg.add(happy_btn);
      bg.add(angry_btn);
      bg.add(surprise_btn);

      leftpanel.add(sad_btn);
      leftpanel.add(happy_btn);
      leftpanel.add(angry_btn);
      leftpanel.add(surprise_btn);

      //rightpanel
      JPanel rightpanel=new JPanel();
      rightpanel.setBorder(BorderFactory.createTitledBorder("Emoji"));
      label=new JLabel();
      rightpanel.add(label);

      add(leftpanel,BorderLayout.WEST);
      add(rightpanel,BorderLayout.CENTER);
      sad_btn.addActionListener(this);
      happy_btn.addActionListener(this);
      angry_btn.addActionListener(this);
      surprise_btn.addActionListener(this);
  }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      if(sad_btn.isSelected())
      {
          //System.out.println(actionEvent.getSource());
          label.setIcon(new ImageIcon(getClass().getResource("/images/f1.jpg")));
      }
      else if(happy_btn.isSelected())
      {
          label.setIcon(new ImageIcon(getClass().getResource("/images/f1.jpg")));
      }
      else if(angry_btn.isSelected())
      {
          label.setIcon(new ImageIcon(getClass().getResource("/images/f1.jpg")));
      }
      else
      {
          label.setIcon(new ImageIcon(getClass().getResource("/images/f1.jpg")));
      }
    }
}
public class Main {
    public static void main(String[] args) {
     new EmojiRadio();
    }
}
