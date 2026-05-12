import javax.sound.midi.SysexMessage;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Double> product = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number" +
                    "\n1.Add \n2.update \n3.remove \n4.search \n5.display \n6.exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter the product name");
                    String name = sc.next();
                    System.out.println("enter the product price");
                    double price = sc.nextDouble();
                    if (product.containsKey(name)) {
                        System.out.println("product already found");
                    } else {
                        product.put(name, price);
                        System.out.println("ProductName:" + name + "productPrice:" + price);
                    }
                    break;
                case 2:
                    System.out.println("Enter the product name");
                    String p_name = sc.next();
                    System.out.println("Enter the new val");
                    double price1 = sc.nextDouble();
                    if (product.containsKey(p_name)) {
                        product.put(p_name, price1);
                        System.out.println("name:" + p_name + "new_val:" + price1);
                    } else {
                        System.out.println("product not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter the product name");
                    String r_product = sc.next();
                    if (product.remove(r_product) != null) {
                        System.out.println("Removed:" + r_product);
                    } else {
                        System.out.println("Product is not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the product name:");
                    String product2 = sc.next();
                    if (product.containsKey(product2)) {
                        System.out.println("name:" + product2 + "value" + product.get(product2));
                    } else {
                        System.out.println("product is not found");
                    }
                    break;
                case 5:
                    if (product.isEmpty()) {
                        System.out.println("product is empty");
                        return;
                    }
                    for (Map.Entry m : product.entrySet()) {
                        System.out.println(m.getKey() + " " + m.getValue());
                    }
                    break;
                default:
                    return;
            }

        }
    }
}