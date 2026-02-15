import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// class ColorPopUp extends JFrame implements MouseListener
// {
//   ColorPopUp()
//   {
//     setTitle("ColorPopUp");
//     setSize(300,400);
//     setLayout(null);

//     JPanel panel=new JPanel();
//     add(panel);

//    JPopupMenu menu=new JPopupMenu();

//    JMenuItem redItem=new JMenuItem("red");
//    JMenuItem greenItem=new JMenuItem("green");
//    JMenuItem blueItem=new JMenuItem("blue");

//    menu.add(redItem);
//    menu.add(greenItem);
//    menu.add(blueItem);

//    redItem.addActionListener(e->panel.setBackground(Color.RED));
//    greenItem.addActionListener(e->panel.setBackground(Color.GREEN));
//    blueItem.addActionListener(e->panel.setBackground(Color.BLUE));
//    panel.addMouseListener(new MouseAdapter() {
//      public void mousePressed(MouseEvent e){
//         if(e.isPopupTrigger())
//         {
//             menu.show(panel, e.getX(), e.getY());
//         }
//      }
//      public void mouseReleased(MouseEvent e){
//         if(e.isPopupTrigger())
//         {
//             menu.show(panel,e.getX(),e.getY());
//         }
//      }
//      public void mouseEntered(MouseEvent e){}
//      public void mouseClicked(MouseEvent e){}
//     public void mouseExited(MouseEvent e){}
//     });
//     setVisible(true);
//     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   }
 
  
// }
class ColorPopUp extends JFrame 
{
  ColorPopUp()
  {
    setTitle("popUpMenu");
    setSize(300,400);
    JPanel panel=new JPanel();
    add(panel);

    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem redItem=new JMenuItem("red");
    JMenuItem greenItem=new JMenuItem("green");
    JMenuItem blueItem=new JMenuItem("blue");

    popupMenu.add(redItem);
    popupMenu.add(greenItem);
    popupMenu.add(blueItem);

    panel.add(popupMenu);
    redItem.addActionListener(e->panel.setBackground(Color.RED));
    blueItem.addActionListener(e->panel.setBackground(Color.BLUE));
    greenItem.addActionListener(e->panel.setBackground(Color.GREEN));
    panel.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent m)
      {
       if(m.isPopupTrigger())
       {
        popupMenu.show(m.getComponent(),m.getX(),m.getY());
       }
      }
      public void mouseReleased(MouseEvent m)
      {
       if(m.isPopupTrigger())
       {
        popupMenu.show(m.getComponent(),m.getX(),m.getY());
       }
      }
      public void mouseClicked(MouseEvent m){}
      public void mouseEntered(MouseEvent m){}
      public void mouseExited(MouseEvent m){}
    });
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
  }
  
}
public class ColorPopUpMenu {
  
   public static void main(String[] args) {
     new ColorPopUp();
   }    
}
