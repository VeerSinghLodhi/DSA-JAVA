
package Singly_Circular_LL;
class Employee{
    int empid;
    double salary;
    String name;
    Employee next;
    Employee(int empid,String name,double salary){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.next=null;
    }
}

public class Singly_Circular_LL4 {
    private static Employee head=null;
    public static void addNewEmp(){
        try{
            System.out.print("Enter Employee Id : ");
            int empid=sc.nextInt();
            System.out.print("Enter Employee Name : ");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.print("Enter Employee Salary : ");
            double salary=sc.nextDouble();
            
            Employee newEmp=new Employee(empid,name,salary);
            if(head==null){
                head=newEmp;
            }else{
                Employee temp,last=null;
                for(temp=head;temp!=null;temp=temp.next){
                    last=temp;
                }
                last.next=newEmp;
            }
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    public static void traverseEmp(){
        try{
            if(head==null){
                System.out.println("No Employee Found!!");
                return;
            }
            Employee temp=head;
            while(temp!=null){
                System.out.println("Employee Id "+temp.empid);
                System.out.println("Employee Name is "+temp.name);
                System.out.println("Employee Salary is "+temp.salary);
                System.out.println("-----------------------------");
                temp=temp.next;
            }
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    public static java.util.Scanner sc=new java.util.Scanner(System.in);
    public static void main(String [] args){
        int choice;
        do{
            System.out.println("1. Add New Employee");
            System.out.println("2. Show All Employee");
            System.out.println("3. Exit");
            System.out.print("Select a choice : ");
            choice=sc.nextInt();
            if(choice==1){
                addNewEmp();
            }
            else if(choice==2){
                traverseEmp();
            }
            else if(choice==3){
                System.out.println("Exited");
            }else{
                System.out.println("Invalid choice");
            }
        }while(choice!=3);
    }
    
}
