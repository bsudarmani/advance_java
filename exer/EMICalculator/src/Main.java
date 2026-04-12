import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import javax.swing.*;
class EMICalculator extends JFrame implements ActionListener
{
   JLabel loan,interest,month,monthEMI;
   JTextField tloan,tinterest,tmonth,txtEMI;
   JButton cal_btn;
    EMICalculator()
    {
     setTitle("EMI Calculator");
     setSize(400,400);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     Font font=new Font("Arial",Font.BOLD,13);


     loan=new JLabel("Enter loan Amount:");
     loan.setBounds(20,40,150,40);
     loan.setFont(font);

        interest=new JLabel("Monthly Interest:");
        interest.setBounds(20,80,120,40);
        interest.setFont(font);

        month=new JLabel("Enter no of Month:");
        month.setBounds(20,120,120,40);
        month.setFont(font);


        monthEMI=new JLabel("Monthly EMI:");
        monthEMI.setBounds(20,260,120,40);
        monthEMI.setFont(font);

        tloan=new JTextField();
        tloan.setBounds(150,48,150,20);
        tloan.setFont(font);

        tinterest=new JTextField();
        tinterest.setBounds(150,88,150,20);
        tinterest.setFont(font);


        tmonth=new JTextField();
        tmonth.setBounds(150,130,150,20);
        tmonth.setFont(font);
        add(loan);

        txtEMI=new JTextField();
        txtEMI.setBounds(150,260,150,40);
        txtEMI.setFont(font);
        add(txtEMI);

        cal_btn=new JButton("Calculate EMI");
        cal_btn.setBounds(40,200,150,50);
        cal_btn.setFont(font);
        cal_btn.setBackground(Color.BLACK);
        cal_btn.setForeground(Color.WHITE);

     add(interest);
     add(month);
     add(tloan);
     add(tinterest);
     add(tmonth);
     add(cal_btn);
     add(monthEMI);
     add(txtEMI);
     cal_btn.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
     double principle=Double.parseDouble(tloan.getText());
     double rate=Double.parseDouble(tinterest.getText())/100;
     int month=Integer.parseInt(tmonth.getText());
     double emi=(principle*rate*Math.pow(1+rate,month))/(Math.pow(1+rate,month)-1);
     txtEMI.setText(new String(String.valueOf(emi)));

    }
}
public class Main
{
    public static void main(String[] args) {
      new EMICalculator();
    }
}