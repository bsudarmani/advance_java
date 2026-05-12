import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginForm extends JFrame implements ActionListener
{
    JLabel nlabel,plabel;
    JTextField tname;
    JPasswordField tpass;
    JButton sub_btn,clr_btn;
    LoginForm()
    {
      setTitle("Login form");
     setSize(600,600);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     Font font=new Font("Arial",Font.BOLD,13);

     //label
     nlabel=new JLabel("Enter the name:");
     nlabel.setFont(font);
     nlabel.setBounds(40,40,100,120);

     tname=new JTextField();
     tname.setFont(font);
     tname.setBounds(140,90,80,30);

        plabel=new JLabel("Enter the password:");
        plabel.setFont(font);
        plabel.setBounds(40,80,200,120);

        tpass=new JPasswordField();
        tpass.setFont(font);
        tpass.setBounds(180,130,80,30);

        sub_btn=new JButton("submit");
        sub_btn.setFont(font);
        sub_btn.setBounds(60,250,80,60);

        clr_btn=new JButton("clear");
        clr_btn.setFont(font);
        clr_btn.setBounds(180,250,80,60);

     add(nlabel);
     add(plabel);
     add(tname);
     add(tpass);
     add(sub_btn);
     add(clr_btn);
     sub_btn.addActionListener(this);
     clr_btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String name=tname.getText();
        String password=new String(tpass.getPassword());
        if(name.equals("admin") && password.equals("12345"))
        {
            JOptionPane.showMessageDialog(this,"username and passord is correc");
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
      new LoginForm();
    }
}