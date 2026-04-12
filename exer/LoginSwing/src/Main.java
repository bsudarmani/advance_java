import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginPage extends JFrame implements ActionListener
{
    JLabel lname,lpass;
    JTextField tname;
    JPasswordField tpass;
    JButton sub_btn,clr_btn;
    LoginPage()
    {
     setTitle("Login Page");
     setSize(300,400);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);

      Font font=new Font("Arial",Font.BOLD,13);


      //label
        lname=new JLabel("Enter the name:");
        lname.setBounds(30,50,120,120);
        lname.setFont(font);

        lpass=new JLabel("Enter the password:");
        lpass.setBounds(30,100,150,150);
        lpass.setFont(font);

        tname=new JTextField();
        tname.setBounds(140,100,90,20);
        tname.setFont(font);

        tpass=new JPasswordField();
        tpass.setBounds(160,170,70,20);
        tpass.setFont(font);

        sub_btn=new JButton("submit");
        sub_btn.setBounds(40,200,120,20);
        sub_btn.setFont(font);
        sub_btn.setBackground(Color.BLACK);
        sub_btn.setForeground(Color.WHITE);

        clr_btn=new JButton("clr ");
        clr_btn.setBounds(40,250,120,20);
        clr_btn.setFont(font);
        clr_btn.setBackground(Color.BLACK);
        clr_btn.setForeground(Color.WHITE);

        add(lname);
        add(lpass);
        add(tname);
        add(tpass);
        add(sub_btn);
        add(clr_btn);
        clr_btn.addActionListener(e->clearbtn());
        sub_btn.addActionListener(e->subbtn());
    }

    private void subbtn() {
        String name=tname.getText();
        String password=new String(tpass.getPassword());
        if(name.equals("admin") && password.equals("12345"))
        {
            JOptionPane.showMessageDialog(this,"Username and password correct");
        }
        else
        {
            if(!name.equals("admin") && !password.equals("12345"))
            {
                JOptionPane.showMessageDialog(this,"username and passowrd incorrct");;
            }
            else if(!password.equals("12345"))
            {
                JOptionPane.showMessageDialog(this,"password incorrect");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"username incorrect");
            }
        }
    }

    private void clearbtn() {
        tname.setText("");
        tpass.setText("");

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
public class Main {
    public static void main(String[] args) {
       new LoginPage();
    }
}