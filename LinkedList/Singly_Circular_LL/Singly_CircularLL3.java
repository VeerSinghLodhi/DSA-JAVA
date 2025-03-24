package Singly_Circular_LL;

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

public class Singly_CircularLL3 {

    private static Person head = null;
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Function for add Person   
    public static void addNewPerson() {
        try {
            System.out.print("Enter Serial number : ");
            int srno = scanner.nextInt();
            System.out.print("Enter name : ");
            scanner.nextLine();
            String name = scanner.nextLine();
            // Memory Allocation
            Person newPerson = new Person(srno, name);

            if (head == null) {
                head = newPerson;
                head.next = head;
            } else {
                Person temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newPerson;
                newPerson.next = head;
            }
            System.out.println("New Person Added");

        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void traverse() {
        try {
            if (head == null) {
                System.out.println("Empty!!");
                return;
            }
            Person temp = head;
            do {
                System.out.println("Serial no. " + temp.srno);
                System.out.println("Name is " + temp.name);
                System.out.println("-------------------------------------");
                temp = temp.next;
            } while (temp != head);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void search() {
        try {
            if (head == null) {
                System.out.println("Empty!!");
                return;
            }
            System.out.print("Enter Serial no. to search : ");
            int srno = scanner.nextInt();
            boolean res=false;
            Person temp = head;
            do {
                if (srno == temp.srno) {
                    System.out.println("Serial no. " + temp.srno);
                    System.out.println("Name is " + temp.name);
                    System.out.println("-------------------------------------");
                    res=true;
                    break;
                }
                temp = temp.next;
            } while (temp != head);
            if(!res)
                System.out.println(srno+" doesn't exists");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("1. Add new Person");
            System.out.println("2. Show all Person");
            System.out.println("3. Search");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            ch = scanner.nextInt();
            if (ch == 1) {
                addNewPerson();
            } else if (ch == 2) {
                traverse();
            } else if (ch == 3) {
                search();
            }

        } while (ch != 4);
    }
}
