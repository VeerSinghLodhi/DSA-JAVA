package LinkedList;

class LL {

    int data;
    LL next;

    //Constructor
    LL(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLL3 {

    private static LL head = null;
    static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void addData() {

        System.out.print("Enter data : ");
        int data = scanner.nextInt();
        LL newData=new LL(data);
        if(head==null){
            head=newData;
        }else{
            LL current =head ;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newData;
        }
        
    }

    public static void traverse() {
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
         LL current =head ;
            while(current!=null){
                System.out.println("Data is "+current.data);
                System.out.println("--------------------------");
                current=current.next;
            }
    }

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("1. Add Data");
            System.out.println("2. Traverse");
            System.out.println("3. Exit");
            System.out.print("Select a choice : ");
            ch = scanner.nextInt();
            if (ch == 1) {
                addData();
            } else if (ch == 2) {
                traverse();
            }
        } while (ch != 3);
    }
}
