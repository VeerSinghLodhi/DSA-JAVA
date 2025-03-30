
package Queue_DS;
class Queue{
    int data;
    Queue next;
    public Queue(int data){
        this.data=data;
        this.next=null;
    }
}

public class Queue_DS1 {
    private static Queue front=null; // Front End of the Queue.
    private static Queue rear=null; // Rear End to the Queue.
    public static java.util.Scanner scanner=new java.util.Scanner(System.in);
    // Enqueue Function for add new data.
    public static void enqueue(){
        try{
            System.out.print("Enter Data : ");
            int data=scanner.nextInt();
            
            Queue newData=new Queue(data);
            if(front==null){
                front=newData;
                rear=newData;
            }else{
                rear.next=newData;
                rear=newData;
            }
            System.out.println("New Data Added");
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    // traverse Function for display all data.
    public static void traverse(){
        try{
            if(front==null){
                System.out.println("Queue is empty!!");
                return;
            }
            System.out.println("Data are : ");
            System.out.println("------------------------");
            Queue temp=front;
            while(temp!=null){
                System.out.println("Data is "+temp.data);
                System.out.println("-----------------------");
                temp=temp.next;
            }
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    // Deque Function for delete from front end.
    public static void deque(){
        try{
            if(front==null){
                System.out.println("Queue is empty!!");
                return;
            }
            System.out.println("Deleted Record is : ");
            System.out.println("Data is "+front.data);
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
            System.out.println("1. Enqueue");
            System.out.println("2. Traverse");
            System.out.println("3. Deque");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            choice=scanner.nextInt();
            if(choice==1)
                enqueue();
            else if(choice==2)
                traverse();
            else if(choice==3)
                deque();
            else if(choice==4)
                System.out.println("Exited!");
            else
                System.out.println("Invalid choice!!");
        }while(choice!=4);
    }
}
