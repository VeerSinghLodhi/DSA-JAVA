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

public class Double_Circular_LL2 {

    private static Student head = null;// Head of the Linked List
    private static Student end = null;//  End of the Linked List
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Function for add new Student
    public static void addNewStudent() {
        try {
           System.out.print("Enter Student Roll No. : ");
           int rollno=scanner.nextInt();
           System.out.print("Enter Name : ");
           scanner.nextLine();
           String name=scanner.nextLine();
           
           Student newStudent=new Student(rollno,name);
           if(head==null){
               head=end=newStudent;
               head.prev=end;
               end.next=head;
           }else{
               newStudent.next=head;
               newStudent.prev=end;
               end.next=newStudent;
               end=newStudent;
               head.prev=end;
           }
           System.out.println("New Student Added!!");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse or display(Head to End).
    public static void traverseHeadToEnd() {
        try {
            if(head==null){
                System.out.println("No Student Found!!");
                return;
            }
            System.out.println("---------------------------------");
            Student temp=head;
            do{
                System.out.println("Student Roll no. is "+temp.rollno);
                System.out.println("Student Name is "+temp.name);
                System.out.println("---------------------------------");
                temp=temp.next;
            }while(temp!=head);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for traverse or display(End to Head).
    public static void traverseEndToHead() {
        try {
            if(head==null){
                System.out.println("No Student Found!!");
                return;
            }
            System.out.println("---------------------------------");
            Student temp=end;
            do{
                System.out.println("Student Roll no. is "+temp.rollno);
                System.out.println("Student Name is "+temp.name);
                System.out.println("---------------------------------");
                temp=temp.prev;
            }while(temp!=end);
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
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            choice = scanner.nextInt();
            if (choice == 1) {
                addNewStudent();
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
