package Stack;

class Person {

    int srno;
    String name;
    Person next;

    public Person(int srno, String name) {
        this.srno = srno;
        this.name = name;
        this.next = null;
    }
}

public class Stack3 {

    private static Person top = null;
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    //Method for add new Person
    public static void addNewPerson() {
        try {
            System.out.print("Enter Serial no : ");
            int srno = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Person Name : ");
            String name = scanner.nextLine();

            Person newPerson = new Person(srno, name);
            if(newPerson==null){
                System.out.println("Cannot allocated memory!!");
                return;
            }
            if (top == null) {
                top = newPerson;
            } else {
                newPerson.next = top;
                top = newPerson;
            }
            System.out.println("New Person Added!!");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Method for traverse of display person details
    public static void getTraverse() {
        try {
            if (top == null) {
                System.out.println("No Person Found!!");
                return;
            }
            System.out.println("Person Details are : ");
            System.out.println("-------------------------------");
            Person temp = top;
            while (temp != null) {
                System.out.println("Serial no is " + temp.srno);
                System.out.println("Name is " + temp.name);
                System.out.println("-------------------------------");
                temp = temp.next;
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }
    // Method for delete a Person (Pop)
    public static void getDeletePerson() {
        try {
            if (top == null) {
                System.out.println("No Person Found!!");
                return;
            }
            System.out.println("Popped Person is : ");
            System.out.println("-------------------------------");
            System.out.println("Serial no is " + top.srno);
            System.out.println("Name is " + top.name);
            System.out.println("-------------------------------");
            top = top.next;
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("----Stack Menu----");
            System.out.println("1. Add New Person");
            System.out.println("2. Display All Person");
            System.out.println("3. Delete a Person");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            choice = scanner.nextInt();
            if (choice == 1) {
                addNewPerson();
            } else if (choice == 2) {
                getTraverse();
            } else if (choice == 3) {
                getDeletePerson();
            } else if (choice == 4) {
                System.out.println("Exited!!");
            } else {
                System.out.println("Invalid choice!!");
            }
        } while (choice != 4);
    }
}
