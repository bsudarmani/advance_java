import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ProductList extends JFrame
{
    JScrollPane pane;
    JList<String> list;
    JLabel l1,l2,l3,l4;
    ProductList()
    {
         setTitle("Product List");
         setSize(600,300);
         setLayout(new GridLayout(4,3,5,5));

         l1=new JLabel("Product of price:",SwingConstants.CENTER);
         l2=new JLabel("Select Prouct:");
         l3=new JLabel("price");
         l4=new JLabel("");
         String[] product={"pen", "pencil", "Eraser","bag","lunchbag"};
         list=new JList<>(product);
         pane=new JScrollPane(list);
        add(new Label(""));
         add(l1);
         add(new Label(""));
         add(l2);
         add(new Label(""));
         add(pane);
         add(l3);
         add(new Label(""));
        add(l4);
         add(new Label(""));
        list.addListSelectionListener(e->
        {
            if(!e.getValueIsAdjusting())
            {
                price(list.getSelectedValue());
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void price(String product)
    {
     if(product==null) return;
     switch (product)
     {
         case "pen"->l4.setText("4");
         case "pencil"->l4.setText("5");
         case "Eraser"->l4.setText("3");
     }
    }
}
public class Main {
    public static void main(String[] args) {
     new ProductList();
    }
}