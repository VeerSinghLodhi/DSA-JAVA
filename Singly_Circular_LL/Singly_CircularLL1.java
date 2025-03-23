package Singly_Circular_LL;

class SCLL {

    int data;
    SCLL next;

    SCLL(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Singly_CircularLL1 {

    private static SCLL head = null;
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Function for add new Data in the Singly circular Link list
    public static void addData() {
        try {
            System.out.print("Enter Data : ");
            int data = scanner.nextInt();
            SCLL newData = new SCLL(data);
            if (head == null) {
                head = newData;
                head.next = head;
            } else {
                SCLL last = head;
                do {
                    last = last.next;
                } while (last.next != head);
                last.next = newData;
                newData.next=head;
            }
            System.out.println("New Data Added");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse of display the linked list elements
    public static void traverse() {
        try {
            if (head == null) {
                System.out.println("No Data Found!!");
            } else {
                SCLL temp = head;
                do {
                    System.out.println("Data is " + temp.data);
                    System.out.println("----------------------------");
                    temp = temp.next;
                } while (temp!= head);
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void main(String[] args) {
        int ch;
        do {
            // Linked List Menu
            System.out.println("1. Add new Data");
            System.out.println("2. Traverse");
            System.out.println("3. Exit");
            System.out.print("Select a choice : ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1 ->
                    addData();
                case 2 ->
                    traverse();
                case 3 ->
                    System.out.println("Exited!!");
                default ->
                    System.out.println("Invalid choice");
            }
        } while (ch != 3);
    }
}
