import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class NumberCheck extends JFrame implements ActionListener
{
  JLabel labelres,label;
  JTextField text;
  JButton btn_prim,btn_Arms,btn_evenodd,btn_palin;
    NumberCheck()
    {
      setSize(400,400);
      setTitle("NumberChecker");
      setLayout(null);
    
      JPanel inputpanel=new JPanel();
      label=new JLabel("Enter the number");
      label.setBounds(70, 20, 150, 10);
      label.setFont(new Font("Arial",Font.BOLD,15));
      inputpanel.add(label);

      text=new JTextField(15);
      text.setBounds(60, 60, 150, 30);
      text.setFont(new Font("Arial",Font.BOLD,16));
      inputpanel.add(text);

      Font font=new Font("Arial",Font.BOLD,20);

      JPanel panel=new JPanel(new GridLayout(2, 2, 10, 10));
      btn_prim=new JButton("Prime");
      btn_Arms=new JButton("Armstrong");
      btn_evenodd=new JButton("EvenorAdd");
      btn_palin=new JButton("palindrome");
      btn_prim.setBounds(20,30,10,20);

      btn_prim.setFont(font);
      btn_Arms.setFont(font);
      btn_evenodd.setFont(font);
      btn_palin.setFont(font);

      panel.add(btn_Arms);
      panel.add(btn_prim);
      panel.add(btn_evenodd);
      panel.add(btn_palin);

     labelres=new JLabel("result");
     labelres.setFont(font);
     labelres.setHorizontalAlignment(SwingConstants.CENTER);
     setLayout(new BorderLayout(2,2));
     add(inputpanel,BorderLayout.NORTH);
     add(panel,BorderLayout.CENTER);
     add(labelres,BorderLayout.SOUTH);

     btn_Arms.addActionListener(this);
     btn_evenodd.addActionListener(this);
     btn_palin.addActionListener(this);
     btn_prim.addActionListener(this);

      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    public boolean prim(int n)
    {
      if(n<=1) return false;
      for(int i=2;i<Math.sqrt(n);i++)
      {
        if(i%n==0)
        {
          return false;
        }
      }
      return true;
    }
    public boolean palin(int n)
    {
      int temp=n;
      int reverse=0;
      while(n!=0)
      {
        int digit=n%10;
        reverse=reverse*10+digit;
        n/=10;
      }
      return temp==reverse;
    }
    public boolean arm(int n)
    {
      int temp=n,res=0;
      int digits=String.valueOf(n).length();
      while(n!=0)
      {
        int digit=n%10;
        res+=Math.pow(digit, digits);
        n/=10;
      }
      return res==temp;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
      String input=text.getText().trim();
      if(input.isEmpty())
      {
        labelres.setText("Enter the input");
        return;
      }
      int num;
      try
      {
        num=Integer.parseInt(input);
      }
      catch(NumberFormatException ex)
      {
        labelres.setText("Enter the valid input");
        return;
      }
      if(e.getSource()==btn_evenodd)
      {
        if(num%2==0)
        {
          labelres.setText("even");
        }
        else
        {
          labelres.setText("odd");
        }
      }
      if(e.getSource()==btn_prim)
      {
        if(prim(num))
        {
          labelres.setText("Prim");
        }
        else
        {
          labelres.setText("Not prim");
        }
      }
      if(e.getSource()==btn_Arms)
      {
        if(arm(num))
        {
          labelres.setText("Armstrong");
        }
        else
        {
          labelres.setText("Not Armstrong");
        }
      }
      if(e.getSource()==btn_palin)
      {
        if(palin(num))
        {
         labelres.setText("Palindrome");
        }
        else
        {
         labelres.setText("Not palindrome");
        }
      }
    }
}

 class NumberChecker {
    public static void main(String[] args) {
     new NumberCheck();   
    }
}
