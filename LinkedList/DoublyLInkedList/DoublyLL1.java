
package DoublyLInkedList;
class DLL{
    int data;  // Data Part
    DLL prev;  // Previous Node Address
    DLL next;  // Next Node Address
    //Constructor
    DLL(int data){
        this.data=data; 
        this.prev=null;  
        this.next=null;
    }
}
// Class name.....
public class DoublyLL1 {
    private static DLL head=null; // Head of the Linked List
    
    private static DLL end=null;  // End of the Linked List
    
    static java.util.Scanner scanner=new java.util.Scanner(System.in);
    
    // addData-> Fucntion for add the new Data in the Linked List.
    public static void addData(){
        
        System.out.print("Entet Data : ");
        int data=scanner.nextInt();
        DLL newData=new DLL(data);
        
        if(head==null){
            head=end=newData;
        }else{
            newData.prev=end;
            end.next=newData;
            end=newData;
        }
        System.out.println("New Data Added");
    }
    
    /* traverseHeadToEnd -- > Function for traverse or display the all elements of Linked List.(Head to End)
    
    NODE-->
    
    | previous node address  |  Info Part(Data)  | next node address
    
    HOW THEY ARE CONNECTED TO EACH OTHER
    
    EXAMPLE
    
    |N-|-10-|90-| <===> |-80|-10-|100-|  <===> |-90|-10-|110-| <===> |-100|-10-|N-|
        80                   90                     100                 110
       Head                                                                End
    
    */
    public static void traverseHeadToEnd(){
        if(head==null){
            System.out.println("Linked list is empty!!");
            return;
        }
        DLL temp=head;
        while(temp!=null){
            System.out.println("Data is "+temp.data);
            System.out.println("----------------------------------------");
            temp=temp.next;
        }
    }
    
    // traverseEndToHead -- > Function for traverse or display the all elements of Linked List.(End to Head).
    public static void traverseEndToHead(){
        if(head==null){
            System.out.println("Linked list is empty!!");
            return;
        }
        DLL temp=end;
        while(temp!=null){
            System.out.println("Data is "+temp.data);
            System.out.println("----------------------------------------");
            temp=temp.prev;
        }
    }
    
    //Main Method
    public static void main(String [] args){
        int ch;
        do{
            // Linked List Menu;
            System.out.println("1. Add New Data");
            System.out.println("2. Traverse(Head to End)");
            System.out.println("3. Traverse(End to Head)");
            System.out.println("5. Exit");
            System.out.print("Select a Choice : ");
            ch=scanner.nextInt();
            switch (ch) {
                case 1 -> addData();
                case 2 -> traverseHeadToEnd();
                case 3 -> traverseEndToHead();
                default -> {
                    System.out.println("Invalid Choice!!");
                }
            }
        }while(ch!=4);
    }
}
