package Double_Circular_LL;

class DCLL {

    int data;
    DCLL prev;  // For Previous Node address
    DCLL next;  // For Next Node Address

    DCLL(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Double_Circular_LL1 {

    private static DCLL head = null;// Head of the Linked list.
    private static DCLL end = null;//  End of the Linked List.
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Function for add new data.
    public static void addNewData() {
        try {
            System.out.println("----------------------------------------");
            System.out.print("Enter data : ");
            int data = scanner.nextInt();
            DCLL newData = new DCLL(data);
            if (head == null) {
                head = end = newData;
                head.prev = end;
                end.next = head;
            } else {
                newData.next = head;
                newData.prev = end;
                end.next = newData;
                end = newData;
                head.prev = end;
            }
            System.out.println("New Data Added");
            System.out.println("----------------------------------------");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Head to End
    // Function for traverse or display of the linked list elements.
    public static void traverseHeadToEnd() {
        try {
            if (head == null) {
                System.out.println("No Data Found!!");
            } else {
                System.out.println("-------------------------------");
                DCLL temp = head;  // Start from head;
                do {
                    System.out.println("Data is " + temp.data);
                    System.out.println("-------------------------------");
                    temp = temp.next; // Move to the next node.
                } while (temp != head);
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Head to End
    // Function for traverse or display of the linked list elements.
    public static void traverseEndToHead() {
        try {
            if (head == null) {
                System.out.println("No Data Found!!");
            } else {
                System.out.println("-------------------------------");
                DCLL temp = end; // Start from end;
                do {
                    System.out.println("Data is " + temp.data);
                    System.out.println("-------------------------------");
                    temp = temp.prev; // Move to the prev node.
                } while (temp != end);
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            // Linked List Menu.
            System.out.println("1. Add New Data");
            System.out.println("2. Traverse (Head to End)");
            System.out.println("3. Traverse (End to Head)");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            choice = scanner.nextInt();
            if (choice == 1) {
                addNewData();
            } else if (choice == 2) {
                traverseHeadToEnd();
            } else if (choice == 3) {
                traverseEndToHead();
            } else if (choice == 4) {
                System.out.println("Exited!!");
            } else {
                System.out.println("Invalid choice!!");
            }
        } while (choice != 4);
    }
}
