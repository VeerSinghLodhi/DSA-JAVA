
package DoublyLInkedList;
class DLL{
    int data;
    DLL prev,next;
    DLL(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

public class DoublyLL1 {
    private static DLL head=null,end=null;
    static java.util.Scanner scanner=new java.util.Scanner(System.in);
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
    public static void main(String [] args){
        int ch;
        do{
            System.out.println("1. Add New Data");
            System.out.println("2. Traverse(Head to End)");
            System.out.println("3. Traverse(End to Head)");
            System.out.println("5. Exit");
            System.out.print("Select a Choice : ");
            ch=scanner.nextInt();
            if(ch==1)
                addData();
            else if(ch==2)
                traverseHeadToEnd();
            else if(ch==3)
                traverseEndToHead();
        }while(ch!=4);
    }
}
