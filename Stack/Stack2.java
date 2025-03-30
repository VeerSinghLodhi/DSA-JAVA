
package Stack;
class Student{
    int rollno;
    String name;
    Student next;
    public Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
        this.next=null;
    }
}

public class Stack2 {
    private static Student top=null; // top of the stack.
    public static java.util.Scanner scanner=new java.util.Scanner(System.in);
    //Method for add new Student
    public static void addNewStudent(){
        try{
            System.out.print("Enter Roll no : ");
            int rollno=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Student Name : ");
            String name=scanner.nextLine();
            
            Student newStudent=new Student(rollno,name);
            if(top==null){
                top=newStudent;
            }else{
                    newStudent.next=top;
                    top=newStudent;
            }
            System.out.println("New Student Added");f
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    // Method for traverse of display student details
    public static void getTraverse(){
        try{
            if(top==null){
                System.out.println("No Student Found!!");
                return;
            }
            System.out.println("Student Details are : ");
            System.out.println("-------------------------------");
            Student temp=top;
            while(temp!=null){
                System.out.println("Student Rollno is "+temp.rollno);
                System.out.println("Name is "+temp.name);
                System.out.println("-------------------------------");
                temp=temp.next;
            }
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    public static void getDeleteStudent(){
        try{
            if(top==null){
                System.out.println("No Student Found!!");
                return;
            }
            System.out.println("Popped Student is : ");
            System.out.println("-------------------------------");
            System.out.println("Rollno is "+top.rollno);
            System.out.println("Name is "+top.name);
            System.out.println("-------------------------------");
            top=top.next;
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    public static void main(String [] args){
        int choice;
        do{
            System.out.println("----Stack Menu----");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Student");
            System.out.println("3. Delete a Student");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            choice=scanner.nextInt();
            if(choice==1)
                addNewStudent();
            else if(choice==2)
                getTraverse();
            else if(choice==3)
                getDeleteStudent();
            else if(choice==4)
                System.out.println("Exited!!");
            else
                System.out.println("Invalid choice!!");
        }while(choice!=4);
    }
}
