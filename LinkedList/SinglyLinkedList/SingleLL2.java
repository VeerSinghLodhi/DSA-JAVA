package SinglyLinkedList;

class Person {

    int srno;
    String name;
    Person next = null;

    // Constructor
    Person(int srno, String name) {
        this.srno = srno;
        this.name = name;
        this.next = null;
    }
}

public class SingleLL2 {

    private static Person head = null;
    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void addPerson() {
        int srno;
        String name;
        System.out.print("Enter Serial number : ");
        srno = scanner.nextInt();
        
        System.out.print("Enter Name : ");
        scanner.next();
        name=scanner.nextLine();
        
        Person newPerson=new Person(srno,name);
        // Add the first person
        if(head==null){
            head=newPerson;
        }else{
            Person current=head;
            while(current.next!=null){
                current=current.next;// Find the last element  
            }
            //Add the new student at the end
            current.next=newPerson;
        }
        System.out.println("New Person Added");
    }

    public static void traverse() {
        if(head==null){
            System.out.println("No Person to display");
        }else{
            Person temp=head;
            while(temp!=null){
                System.out.println("Serial no. "+temp.srno);
                System.out.println("Name is "+temp.name);
                System.out.println("---------------------------------------");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("1. Add New Person");
            System.out.println("2. Traverse");
            System.out.println("3. Exit");
            System.out.print("Select a choice : ");
            ch = scanner.nextInt();
            if (ch == 1) {
                addPerson();
            } else if (ch == 2) {
                traverse();
            }
        } while (ch != 3);
    }
}
