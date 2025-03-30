package Queue_DS;

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

public class Queue_DS3 {

    private static Person front = null; // Front End of the Queue.
    private static Person rear = null; // Rear End of the Queue.
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Enqueue Function for add new data.
    public static void addNewPerson() {
        try {
            System.out.print("Enter Serial no  : ");
            int srno = scanner.nextInt();

            System.out.print("Enter Person name : ");
            scanner.nextLine();
            String name = scanner.nextLine();

            Person newStudent = new Person(srno, name);
            if (front == null) {
                front = newStudent;
                rear = newStudent;
            } else {
                rear.next = newStudent;
                rear = newStudent;
            }
            System.out.println("New Person Added");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // traverse Function for display all data.
    public static void showAllPerson() {
        try {
            if (front == null) {
                System.out.println("No Person Found!!");
                return;
            }
            System.out.println("Student Details are : ");
            System.out.println("------------------------");
            Person temp = front;
            while (temp != null) {
                System.out.println("Person Serial no is " + temp.srno);
                System.out.println("Name is " + temp.name);
                System.out.println("-----------------------");
                temp = temp.next;
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Deque Function for delete from front end.
    public static void deleteAPerson() {
        try {
            if (front == null) {
                System.out.println("No Person Found!!");
                return;
            }
            System.out.println("Deleted Record is : ");
            System.out.println("--------------------------");
            System.out.println("Serial no is " + front.srno);
            System.out.println("Name is " + front.name);
            System.out.println("--------------------------");
            front = front.next;
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Main Method
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("----Queue Menu----");
            System.out.println("1. Add New Person");
            System.out.println("2. Show All Person");
            System.out.println("3. Delete a Person");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 ->
                    addNewPerson();
                case 2 ->
                    showAllPerson();
                case 3 ->
                    deleteAPerson();
                case 4 ->
                    System.out.println("Exited!");
                default ->
                    System.out.println("Invalid choice!!");
            }
        } while (choice != 4);
    }
}
