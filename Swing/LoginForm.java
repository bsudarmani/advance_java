import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// class Login extends JFrame implements ActionListener
// {
//     JLabel lbtitle,lbuser,lbpass;
//     JTextField txtname;
//     JPasswordField txtpass;
//     JButton sub_btn,clear_btn;
//     JPanel panel;
//     Login()
//     {
//      setTitle("Login Form");
//      setSize(400,400);
//      setLayout(null);
//      getContentPane().setBackground(new Color(173,216,230));

//      lbtitle=new JLabel("Login");
//      lbtitle.setBounds(140,15,120,30);
//      lbtitle.setFont(new Font("Arial", Font.BOLD,20));
//      add(lbtitle);


//     lbuser=new JLabel("username:");
//     lbuser.setBounds(50, 70, 80, 25);
//     lbuser.setFont(new Font("Arial", Font.BOLD, 15));
//     add(lbuser);

    
//     lbpass=new JLabel("password:");
//     lbpass.setBounds(50, 110, 80, 25);
//     lbpass.setFont(new Font("Arial", Font.BOLD, 15));
//     add(lbpass);


//     txtname=new JTextField();
//     txtname.setBounds(150,70,150,25);
//     txtname.setFont(new Font("Arial",Font.BOLD,20));
//     add(txtname);


//     txtpass=new JPasswordField();
//     txtpass.setBounds(150, 110,150, 25);
//     txtpass.setFont(new Font("Arial",Font.BOLD,20));
//     add(txtpass);

//     sub_btn=new JButton("Login");
//     sub_btn.setBounds(80, 170, 80, 25);
//     // sub_btn.setBackground(Color.BLACK);
//     // sub_btn.setForeground(Color.WHITE);
//     sub_btn.setFont(new Font("Arial",Font.BOLD,15));
//     add(sub_btn);

//     clear_btn=new JButton("clear");
//     clear_btn.setBounds(80, 220, 80, 25);
//     clear_btn.setFont(new Font("Arial",Font.BOLD,15));
//     clear_btn.setBackground(Color.BLACK);
//     clear_btn.setForeground(Color.WHITE);
//     add(clear_btn);

//     sub_btn.addActionListener(this);
//     clear_btn.addActionListener(this);

//      setVisible(true);
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
//     public void actionPerformed(ActionEvent e)
//     {
//        if(e.getSource()==sub_btn)
//        {
//          String name=txtname.getText();
//          String pass=new String(txtpass.getPassword());
//          if((!name.isEmpty() && name.equals("sudar")) && (!pass.isEmpty() && pass.equals("1234")))
//          {
//          JOptionPane.showMessageDialog(this, "username and password correct");
//          }
//          else
//          {
//             if((!name.isEmpty() && !name.equals("sudar") && (!pass.isEmpty() && !pass.equals("1234"))))
//             {
//                 JOptionPane.showMessageDialog(this,"Both of them incorrect");
//             }
//             if((!name.isEmpty() && !name.equals("sudar")))
//             {
//              JOptionPane.showMessageDialog(this,"user name incorrect");
//             }
//             else if((!pass.isEmpty() && !pass.equals("1234")))
//             {
//                 JOptionPane.showMessageDialog(this,"pass incorrect");
//             }
//          }
//        }
//        else
//        {
//         txtname.setText("");
//         txtpass.setText("");
//        }
//     }
// }
class Login extends JFrame implements ActionListener
{
  JLabel lname,lpass;
  JTextField tname;
  JPasswordField tpass;
  JButton sub_btn,clear_btn;
  Login()
  {
   setTitle("Login Page");
   setSize(300,400);
   setLayout(null);

   Font font=new Font("Arial",Font.BOLD,15);
   lname=new JLabel("username:");
   lname.setBounds(10,50,100,100);
   lname.setFont(font);

   tname=new JTextField();
   tname.setBounds(90,90,120,25);
   tname.setFont(font);

   lpass=new JLabel("Password:");
   lpass.setBounds(10,100,100,100);
   lpass.setFont(font);

   tpass=new JPasswordField();
   tpass.setBounds(90,140,120,25);
   tpass.setFont(font);

   sub_btn=new JButton("Login");
   sub_btn.setBounds(20, 200, 80, 25);
   sub_btn.setFont(font);
   sub_btn.setBackground(Color.BLACK);
   sub_btn.setForeground(Color.WHITE);
   add(sub_btn);

   clear_btn=new JButton("clear");
   clear_btn.setBounds(120, 200, 80, 25);
   clear_btn.setFont(font);
   clear_btn.setBackground(Color.BLACK);
   clear_btn.setForeground(Color.WHITE);
   add(clear_btn);

   add(lname);
   add(tname);
   add(lpass);
   add(tpass);

   sub_btn.addActionListener(this);
   clear_btn.addActionListener(this);

   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==sub_btn)
    {

    }
    else
    {
      tname.setText("");
      tpass.setText("");
    }
  }
}
public class LoginForm 
{
  public static void main(String args[])
  {
    new Login();
  }   
}
