import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
class PopUpMenu extends JFrame implements ActionListener
{
    PopUpMenu()
    {
        setTitle("PopUp Menu");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel=new JPanel();
        panel.setBackground(Color.WHITE);
        JPopupMenu popmenu=new JPopupMenu();
        JMenuItem red=new JMenuItem("red");
        JMenuItem green=new JMenuItem("green");
        JMenuItem blue=new JMenuItem("blue");
        popmenu.add(red);
        popmenu.add(green);
        popmenu.add(blue);
        panel.add(popmenu);


        red.addActionListener(e->panel.setBackground(Color.RED));
        green.addActionListener(e->panel.setBackground(Color.GREEN));
        blue.addActionListener(e->panel.setBackground(Color.BLUE));
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger())
                {
                    popmenu.show(e.getComponent(),e.getX(),e.getY());
                }
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger())
                {
                    popmenu.show(e.getComponent(),e.getX(),e.getY());
                }
            }
        });
        add(panel);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
public class Main {
    public static void main(String[] args) {
        new PopUpMenu();
    }
}