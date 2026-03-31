import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener
{
    JLabel userlabel,userpassword;
    JTextField uname;
    JPasswordField upass;
    JButton submit;
    Login()
    {
        setTitle("Login Form");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userlabel=new JLabel("Enter the name");

        userpassword=new JLabel("Enter the password");

        submit=new JButton("Submit");

        add(userlabel);
        add(userpassword);
        add(submit);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
class LoginForm
{
    public static  void main(String args[])
    {
     new Login();
    }
}
