package SinglyLinkedList;
import java.util.Scanner;

class Student {
    int rollno;
    String name;
    Student next; // Reference to the next node in the linked list

    // Constructor
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        this.next = null;
    }
}

public class SingleLL1 {
    private static Student head = null; // Head of the linked list

    // Method to add a new student
    public static void add() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter Roll no: ");
        int rollno = scanner.nextInt();

        System.out.println("Enter Name: ");
        String name = scanner.next();

        Student newStudent = new Student(rollno, name);
        System.out.println("\nAddress is: " + newStudent);

        if (head == null) {
            head = newStudent; // Add the first student
        } else {
            Student current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newStudent; // Add the new student at the end
        }
        System.out.println("New Person Student");
    }

    // Method to display all students
    public static void show() {
        if (head == null) {
            System.out.println("\nNo students to display!");
            return;
        }

        Student current = head;
        System.out.println("\n-------------------------------");
        while (current != null) {
            System.out.println("Roll no: " + current.rollno);
            System.out.println("Name: " + current.name);
            System.out.println("-------------------------------");
            current = current.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add new Student");
            System.out.println("2. Show all Students");
            System.out.println("3. Exit");
            System.out.print("Select a Choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                add();
            } else if (choice == 2) {
                show();
            }
        } while (choice != 3);

        System.out.println("\nThank You!!");
        scanner.close();
    }
}
