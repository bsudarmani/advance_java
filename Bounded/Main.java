import java.util.ArrayList;
import java.util.Scanner;

class GenericStorage<T> {
    private final ArrayList<T> list = new ArrayList<>();

    public void addItem(T item) {
        list.add(item);
    }

    public void displayItems() {
        System.out.println("Stored Items: " + list);
    }
}

class Person {
    String name;
    int age;

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString() {
        return name + " ( " + age + " ) ";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GenericStorage<String> stringStore = new GenericStorage<>();
        GenericStorage<Integer> numberStore = new GenericStorage<>();
        GenericStorage<Person> personStore = new GenericStorage<>();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add String");
            System.out.println("2. Add Integer");
            System.out.println("3. Add Person");
            System.out.println("4. Display All");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter string: ");
                    sc.nextLine();
                    stringStore.addItem(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter integer: ");
                    numberStore.addItem(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    personStore.addItem(new Person(name, age));
                    break;

                case 4:
                    System.out.println("\nStrings:");
                    stringStore.displayItems();

                    System.out.println("Integers:");
                    numberStore.displayItems();

                    System.out.println("Persons:");
                    personStore.displayItems();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}