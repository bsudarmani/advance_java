import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class NumberChecker extends JFrame implements ActionListener
{
    JLabel label;
    JTextField textField;
    JButton prim_btn,arm_btn,pali_btn,odd_even_btn;
   NumberChecker()
   {
    setTitle("Number Checker");
    setSize(300,400);
    setLayout(null);
    setVisible(true);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font font=new Font("Arial",Font.BOLD,15);

    label=new JLabel("Enter the Number:");
    label.setFont(font);
    label.setBounds(20,40,150,100);

    textField=new JTextField();
    textField.setFont(font);
    textField.setBounds(150,80,100,20);

   prim_btn=new JButton("Prime");
   prim_btn.setFont(font);
   prim_btn.setBounds(40,110,100,20);

       pali_btn=new JButton("Palindrome");
       pali_btn.setFont(font);
       pali_btn.setBounds(40,150,150,20);

       arm_btn=new JButton("Armstrong");
       arm_btn.setFont(font);
       arm_btn.setBounds(40,200,150,20);

       odd_even_btn=new JButton("Odd or Even");
       odd_even_btn.setFont(font);
       odd_even_btn.setBounds(40,250,150,20);

    add(label);
    add(textField);
    add(prim_btn);
    add(pali_btn);
    add(arm_btn);
    add(odd_even_btn);
    prim_btn.addActionListener(this);
    pali_btn.addActionListener(this);
    arm_btn.addActionListener(this);
    odd_even_btn.addActionListener(this);
   }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==pali_btn)
    {
        String num=textField.getText();
        String temp=num;
        String res="";
        for(int i=temp.length()-1;i>=0;i--)
        {
            res+=temp.charAt(i);
        }
        if(res.equals(num))
        {
            JOptionPane.showMessageDialog(this,"Palindrome");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Not palindrome");
        }
    }
    else if(e.getSource()==prim_btn)
    {
     int num=Integer.parseInt(textField.getText());
     boolean flag=true;
     if(num<2)
     {
         flag=false;
     }
     for(int i=2;i<=Math.sqrt(num);i++)
     {
         if(num%i==0)
         {
             flag=false;
             break;
         }
     }
     if(flag)
     {
         JOptionPane.showMessageDialog(this,"Prime Number");
     }
     else
     {
         JOptionPane.showMessageDialog(this,"Not Prime Number");
     }
    }
    else if(e.getSource()==arm_btn)
    {
        int num=Integer.parseInt(textField.getText());
        int temp=num;
        int res=0;
        while(temp>0)
        {
            int digit=temp%10;
            res+=digit*digit*digit;
            temp/=10;
        }
        if(res==num)
        {
            JOptionPane.showMessageDialog(this,"Armstrong");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Not Armstrong");
        }
    }
    else
    {
     int num=Integer.parseInt(textField.getText());
     if(num%2==0)
     {
         JOptionPane.showMessageDialog(this,"Even");
     }
     else
     {
         JOptionPane.showMessageDialog(this,"Odd");
     }
    }
    }
}
public class Main {
    public static void main(String[] args) {
     new NumberChecker();
    }
}