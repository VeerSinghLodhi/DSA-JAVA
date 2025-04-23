package Singly_Circular_LL;

class Student {

    int rollno;
    Student next;

    public Student(int rollno) {
        this.rollno = rollno;
        this.next = null;
    }
}

public class Singly_CircularLL5 {

    private static Student start = null;
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void addNode() {
        try {
            System.out.print("Enter Roll no. : ");
            int rollno = scanner.nextInt();
            Student newStudent = new Student(rollno);
            if (start == null) {
                start = newStudent;
                newStudent.next = start;
            } else {
                System.out.println("--------------------------------");
                System.out.println("Where do you want insert?");
                System.out.println("1. At the Beginning");
                System.out.println("2. At the Middle");
                System.out.println("3. At the End");
                System.out.print("Select a choice : ");
                int c = scanner.nextInt();
                if (c == 1) {
                    Student last = start;
                    while (last.next != start) {
                        last = last.next;
                    }
                    newStudent.next = start;
                    start = newStudent;
                    last.next = start;
                } else if (c == 2) {
                    Student temp = start;
                    System.out.print("Enter rollno after which you want to insert the new node : ");
                    int no = scanner.nextInt();
                    do {
                        if (temp.rollno == no) {
                            newStudent.next = temp.next;
                            temp.next = newStudent;
                        }
                        temp = temp.next;
                    } while (temp != start);
                } else if (c == 3) {
                    Student last = start;
                    while (last.next != start) {
                        last = last.next;
                    }
                    last.next = newStudent;
                    newStudent.next = start;
                }

            }
            System.out.println("New Student Added");
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void traverse() {
        try {
            if (start == null) {
                System.out.println("No Students Found!!");
                return;
            }
            Student ptr = start;
            do {
                System.out.println("Roll no " + ptr.rollno);
                System.out.println("----------------------");
                ptr = ptr.next;
            } while (ptr != start);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void delNode() {
        try {
            if (start == null) {
                System.out.println("No Students Found!");
                return;
            }
            Student temp = start,prev=start;
            System.out.print("Enter rollno to delete : ");
            int no = scanner.nextInt();
            do {
                if (temp.rollno == no) {
                    if (temp == start) {
                        if (start.next == start) {
                            start = null;
                        } else {
                            Student last = start;
                            while (last.next != start) 
                                last = last.next;
                            start=start.next;
                            last.next=start;
                        }
                    } else if (temp.next == start) {
                        prev.next=start;

                    } else {
                        prev.next=temp.next;
                    }
                    System.out.println("Student Deleted");
                    break;
                }
                prev=temp;
                temp = temp.next;
            } while (temp != start);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("1. Add new Node");
            System.out.println("2. Traverse");
            System.out.println("3. Delete");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            ch = scanner.nextInt();
            if (ch == 1) {
                addNode();
            } else if (ch == 2) {
                traverse();
            } else if (ch == 3) {
                delNode();
            }
        } while (ch != 4);
    }
}
