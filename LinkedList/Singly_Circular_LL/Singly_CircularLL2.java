package Singly_Circular_LL;

class Student {

    int rollno;
    String name;
    char grade;
    Student next;

    Student(int rollno, String name, char grade) {
        this.rollno = rollno;
        this.name = name;
        this.grade = grade;
    }
}

public class Singly_CircularLL2 {

    private static Student head = null;  // Head of the Student Linked List
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Function for Add new Student
    public static void addStudent() {
        try {
            // Student Rollno
            System.out.print("Enter Student Roll no. : ");
            int rollno = scanner.nextInt();
            boolean res = getCheckRollNo(rollno); // Check if Rollno already exist!
            if (!res) {
                System.out.println("Roll no. " + rollno + " already exist!!");
                return;
            }
            // Student Name
            System.out.print("Enter Student name : ");
            scanner.nextLine();
            String name = scanner.nextLine();
            res = getCheckValidName(name);  //  For valid name, it means: Student name doesn't have any digit, symbol and extra spaces; 
            while (!res) {
                System.out.println("Invaid name!! \nStudent Name should not be have any digit, symbol and extra spaces");
                System.out.print("Enter Valid Student name : ");
                name = scanner.nextLine();
                res = getCheckValidName(name);
            }

            // Student Grade
            System.out.print("Enter Student Grade : ");
            char grade = scanner.nextLine().charAt(0);
            res = getValidGrade(grade);
            while (!res) {
                System.out.println("Invalid Grade!!");
                System.out.print("Enter Valid Student Grade : ");
                grade = scanner.nextLine().charAt(0);
                res = getValidGrade(grade);
            }

            Student newStudent = new Student(rollno, name, grade);
            if (head == null) {
                head = newStudent;
                head.next = head;
            } else {
                Student last = head;
                while (last.next != head) {
                    last = last.next;
                }
                last.next = newStudent;
                newStudent.next = head;
            }

        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    // Function for check if Roll no already exist in the list.
    public static boolean getCheckRollNo(int rollno) {
        try {
            if (head == null) {
                return true;
            }
            Student temp = head;
            do {
                if (temp.rollno == rollno) {
                    return false;
                }
                temp = temp.next;
            } while (temp != head);

        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
        return true;
    }

    // Function for valid Student name
    public static boolean getCheckValidName(String name) {
        try {
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch == ' ')) {
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
        return true;
    }

    // Function for Check valid Student Grade
    public static boolean getValidGrade(char ch) {
        if (ch >= 'a' && ch <= 'e' || ch >= 'A' && ch <= 'E') {
            return true;
        } else {
            return false;
        }
    }

    // Function for traverse or display Students
    public static void traverse() {
        try {
            if (head == null) {
                System.out.println("NO Student found!!");
                return;
            }
            System.out.println("-----------------------------");
            Student temp = head;
            do {
                System.out.println("Student Rollno is " + temp.rollno);
                System.out.println("Student Name is " + temp.name);
                System.out.println("Student Grade is " + temp.grade);
                System.out.println("-----------------------------");
                temp = temp.next;
            } while (temp != head);

        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void searchStudent() {
        try {
            if (head == null) {
                System.out.println("NO Student found!!");
                return;
            }
            System.out.println("-----------------------------");
            int rollno;
            boolean res=false;
            System.out.print("Enter Student Roll no to search : ");
            rollno = scanner.nextInt();
            System.out.println("-----------------------------");
            Student temp = head;
            do {
                if (temp.rollno == rollno) {
                    System.out.println("Student Rollno is " + temp.rollno);
                    System.out.println("Student Name is " + temp.name);
                    System.out.println("Student Grade is " + temp.grade);
                    res=true;
                    break;
                }
                temp = temp.next;
            } while (temp != head);
            if(!res){
                System.out.println(rollno+", this rollno doesn't exist!!");
            }
            System.out.println("-----------------------------");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void deleteStudent() {
        try {
            if (head == null) {
                System.out.println("NO Student found!!");
                return;
            }
            System.out.println("-----------------------------");
            int rollno;
            boolean res=false;
            System.out.print("Enter Student Roll no to delete : ");
            rollno = scanner.nextInt();
            System.out.println("-----------------------------");
            Student temp = head,prev=head;
            do {
                if (temp.rollno == rollno) {
                    if(temp==head){
                        if(head.next==head){
                            head=null;
                        }else{
                            Student last_node=head;
                            while(last_node.next!=head){
                                last_node=last_node.next;
                            }
                            head=head.next;
                            last_node.next=head;
                        }
                        
                    }else if(temp.next==head){
                        prev.next=head;
                    }else{
                        prev.next=temp.next;
                    }
                    System.out.println("Student Deleted!!");
                    res=true;
                    break;
                }
                prev=temp;
                temp = temp.next;
            } while (temp != head);
            if(!res){
                System.out.println(rollno+", this rollno doesn't exist!!");
            }
            System.out.println("-----------------------------");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void main(String[] args) {
        int ch;
        do {
            // Linked List Menu
            System.out.println("1. Add new Student");
            System.out.println("2. Show All Student");
            System.out.println("3. Search a Student");
            System.out.println("4. Delete a Student");
            System.out.println("5. Exit");
            System.out.print("Select a choice : ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1 ->
                    addStudent();
                case 2 ->
                    traverse();
                case 3 ->
                    searchStudent();
                case 4 ->
                    deleteStudent();
                case 5 ->
                    System.out.println("Exited!!");
                default ->
                    System.out.println("Invalid choice");
            }
        } while (ch != 5);
    }
}
