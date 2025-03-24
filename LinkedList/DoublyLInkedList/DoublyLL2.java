package DoublyLInkedList;

class Student {

    int rollno;
    String name;
    char grade;
    Student prev; // For Previous Node Address
    Student next; // For Next Node Address

    Student(int rollno, String name, char grade) {// Constructor
        this.rollno = rollno;
        this.name = name;
        this.grade = grade;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLL2 {

    private static Student head = null; // Head of the Doubly Linked list.
    private static Student end = null;  // End of the Doubly Linked list.
    static java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Function for add new 'New Student' in the Doubly Linked list.
    public static void addNewStudent() {
        try {
            // Input Student Details
            System.out.print("Enter Roll no. : ");
            int rollno = scanner.nextInt();           // Student Roll No.
            System.out.print("Enter Student Name : ");
            scanner.nextLine();                     // For Store Space
            String name = scanner.nextLine();         // Student Name
            System.out.print("Enter Student Grade : ");
            char grade = scanner.nextLine().charAt(0); // Student Grade

            System.out.println(rollno + " " + name + " " + grade);

            // Memory Allocation
            Student newStudent = new Student(rollno, name, grade);//Constructor Arguments

            // Check if doubly linked list is empty.
            if (head == null) {
                head = end = newStudent;// First Node of the Doubly Linked List
            } else {
                newStudent.prev = end;
                end.next = newStudent;
                end = newStudent;
            }
            System.out.println("New Student Added");
            System.out.println("-----------------------------------------------");

        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse or display all the Students of doubly linked list.(Head to End)
    public static void traverseHeadToEnd() {
        try {
            // Check if Linked List is empty
            if (head == null) {
                System.out.println("No Student Found!!");
                return;
            }
            Student temp = head;  // Start from Head Node to End Node
            while (temp != null) {
                System.out.println("Roll no. is " + temp.rollno);
                System.out.println("Student Name is " + temp.name);
                System.out.println("Student Grade is " + temp.grade);
                System.out.println("----------------------------------");
                temp = temp.next;// Move to the next Node. 
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse or display all the Students of doubly linked list.(End to Head).
    public static void traverseEndToHead() {
        try {
            // Check if Linked List is empty
            if (head == null) {
                System.out.println("No Student Found!!");
                return;
            }
            Student temp = end; // Start from End Node to Head Node
            while (temp != null) {
                System.out.println("Roll no. is " + temp.rollno);
                System.out.println("Student Name is " + temp.name);
                System.out.println("Student Grade is " + temp.grade);
                System.out.println("----------------------------------");
                temp = temp.prev;// Move to the previous Node. 
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for search a Student
    public static void getSearch() {
        try {

            int rollno;
            boolean result = false;
            System.out.print("Enter Roll no to search : ");
            rollno = scanner.nextInt();

            // We hava to find this Roll no.
            Student temp = head;
            while (temp != null) {
                if (temp.rollno == rollno) { // Check User rollno in Linked List. if it is true then we will print the student details.
                    System.out.println("Student Details ->");
                    System.out.println("Roll no. is " + temp.rollno);
                    System.out.println("Student Name is " + temp.name);
                    System.out.println("Student Grade is " + temp.grade);
                    System.out.println("----------------------------------");
                    result = true;
                    break;
                }
                temp = temp.next;
            }
            if (!result) {
                System.out.println("Roll no doesn't exist!!");
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for Delete a Student
    public static void getDelete() {
        try {
            int rollno;
            boolean result = false;
            System.out.print("Enter Roll no to search : ");
            rollno = scanner.nextInt();

            // We hava to find this Roll no.
            Student temp = head;
            while (temp != null) {
                if (temp.rollno == rollno) { // Check User rollno in Linked List. if it is true then we will 'Delete'
                    if (temp == head) { // Check, is it head node of the linked list
                        head=head.next;
                        head.prev=null;
                    } else if (temp == end) {// check, is it end node of the linked list
                        end=end.prev;
                        end.next=null;
                    }else{ // If Both Conditions aren't true, it means node will be deleted between head node and end node.
                        temp.prev.next=temp.next;
                        temp.next.prev=temp.prev;
                    }
                    System.out.println("Student Deleted!");
                    System.out.println("------------------------");
                    result = true;
                    break;
                }
                temp = temp.next;
            }
            if (!result) {
                System.out.println("Roll no doesn't exist!!");
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Main Method
    public static void main(String[] args) {
        int ch;
        do {
            // Linked List Menu
            System.out.println("1. Add New Student");
            System.out.println("2. Traverse (Head to End)");
            System.out.println("3. Traverse (End to Head)");
            System.out.println("4. Search a Student");
            System.out.println("5. Delete a Student");
            System.out.println("6. Exit");
            System.out.print("Select a choice : ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1 ->
                    addNewStudent();
                case 2 ->
                    traverseHeadToEnd();
                case 3 ->
                    traverseEndToHead();
                case 4 ->
                    getSearch();
                case 5 ->
                    getDelete();
                case 6 ->
                    System.out.println("By By!!");
                default ->
                    System.out.println("Invalid Choice!!!");
            }
        } while (ch != 6);
    }
}
