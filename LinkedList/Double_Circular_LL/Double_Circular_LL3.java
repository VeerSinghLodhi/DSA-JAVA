package Double_Circular_LL;

class Student {

    int rollno;
    String name;
    Student prev, next;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}

public class Double_Circular_LL3 {

    private static Student head = null;// Head of the Linked List
    private static Student end = null;//  End of the Linked List
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Function for add new Student
    public static void addNewStudent() {
        try {
            System.out.print("Enter Student Roll No. : ");
            int rollno = scanner.nextInt();
            System.out.print("Enter Name : ");
            scanner.nextLine();
            String name = scanner.nextLine();

            Student newStudent = new Student(rollno, name);
            if (head == null) {
                head = end = newStudent;
                head.prev = end;
                end.next = head;
            } else {
                int c;
                System.out.print("Where do you want insert new record?");
                System.out.println("1. At the Begginning");
                System.out.println("2. At the Specific Position");
                System.out.println("3. At the End");
                System.out.print("Select a choice : ");
                c = scanner.nextInt();
                if (c == 1) {
                    head.prev = newStudent;
                    newStudent.next = head;
                    head = newStudent;
                    head.prev = end;
                    end.next = head;
                } else if (c == 2) {
                    int v;
                    boolean res = false;
                    System.out.print("Enter Roll no after which you want insert new record : ");
                    v = scanner.nextInt();
                    Student temp = head;
                    do {
                        if (temp.rollno == v) {
                            newStudent.prev = temp;
                            newStudent.next = temp.next;
                            temp.next.prev = newStudent;
                            temp.next = newStudent;
                            res = true;
                            break;
                        }
                        temp = temp.next;
                    } while (temp != head);
                    if (!res) {
                        System.out.println("Student couldn't be add, " + v + " doesn't exists!!");
                    }
                } else if (c == 3) {
                    newStudent.next = head;
                    newStudent.prev = end;
                    end.next = newStudent;
                    end = newStudent;
                    head.prev = end;
                }
            }

            System.out.println("New Student Added!!");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse or display(Head to End).
    public static void traverseHeadToEnd() {
        try {
            if (head == null) {
                System.out.println("No Student Found!!");
                return;
            }
            System.out.println("---------------------------------");
            Student temp = head;
            do {
                System.out.println("Student Roll no. is " + temp.rollno);
                System.out.println("Student Name is " + temp.name);
                System.out.println("---------------------------------");
                temp = temp.next;
            } while (temp != head);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse or display(End to Head).
    public static void traverseEndToHead() {
        try {
            if (head == null) {
                System.out.println("No Student Found!!");
                return;
            }
            System.out.println("---------------------------------");
            Student temp = end;
            do {
                System.out.println("Student Roll no. is " + temp.rollno);
                System.out.println("Student Name is " + temp.name);
                System.out.println("---------------------------------");
                temp = temp.prev;
            } while (temp != end);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Functioin for search Students{
    public static void searchStudent() {
        try {
            if (head == null) {
                System.out.println("No Student found!!");
                return;
            }
            int s;
            boolean res=false;
            System.out.println("Enter roll no to search : ");
            s = scanner.nextInt();
            Student temp = head;
            do {
                if (s == temp.rollno) {
                    System.out.println("Student Details ->");
                    System.out.println("Student Roll no. is " + temp.rollno);
                    System.out.println("Student Name is " + temp.name);
                    System.out.println("---------------------------------");
                    res=true;
                    break;
                }
                temp = temp.next;
            } while (temp != head);
            if(!res)
                System.out.println(s+" rollno doesn't exists!!");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            // Linked List Menu.
            System.out.println("1. Add New Student");
            System.out.println("2. Traverse (Head to End)");
            System.out.println("3. Traverse (End to Head)");
            System.out.println("4. Search a Student");
            System.out.println("5 . Exit");
            System.out.print("Select a choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 ->
                    addNewStudent();
                case 2 ->
                    traverseHeadToEnd();
                case 3 ->
                    traverseEndToHead();
                case 4 ->
                    searchStudent();
                case 5 ->
                    System.out.println("Exited!!");
                default ->
                    System.out.println("Invalid choice!!");
            }
        } while (choice != 5);
    }
}
