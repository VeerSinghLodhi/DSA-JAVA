
package Queue_DS;
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

public class Queue_DS2 {
     private static Student front=null; // Front End of the Queue.
    private static Student rear=null; // Rear End to the Queue.
    public static java.util.Scanner scanner=new java.util.Scanner(System.in);
    // Enqueue Function for add new data.
    public static void addNewStudent(){
        try{
            System.out.print("Enter Student rollno  : ");
            int rollno=scanner.nextInt();
            
            System.out.print("Enter Student name : ");
            scanner.nextLine();
            String name=scanner.nextLine();
            
            Student newStudent=new Student(rollno,name);
            if(front==null){
                front=newStudent;
                rear=newStudent;
            }else{
                rear.next=newStudent;
                rear=newStudent;
            }
            System.out.println("New Student Added");
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    // traverse Function for display all data.
    public static void showAllStudent(){
        try{
            if(front==null){
                System.out.println("No Student Found!!");
                return;
            }
            System.out.println("Student Details are : ");
            System.out.println("------------------------");
            Student temp=front;
            while(temp!=null){
                System.out.println("Student Roll no is "+temp.rollno);
                System.out.println("Name is "+temp.name);
                System.out.println("-----------------------");
                temp=temp.next;
            }
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    // Deque Function for delete from front end.
    public static void deleteAStudent(){
        try{
            if(front==null){
                System.out.println("No Student Found!!");
                return;
            }
            System.out.println("Deleted Record is : ");
            System.out.println("--------------------------");
            System.out.println("Roll no is "+front.rollno);
            System.out.println("Name is "+front.name);
            System.out.println("--------------------------");
            front=front.next;
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    // Main Method
    public static void main(String [] args){
        int choice;
        do{
            System.out.println("----Queue Menu----");
            System.out.println("1. Add New Student");
            System.out.println("2. Show All Student");
            System.out.println("3. Delete a Student");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            choice=scanner.nextInt();
            if(choice==1)
                addNewStudent();
            else if(choice==2)
                showAllStudent();
            else if(choice==3)
                deleteAStudent();
            else if(choice==4)
                System.out.println("Exited!");
            else
                System.out.println("Invalid choice!!");
        }while(choice!=4);
    }
}
