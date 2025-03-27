
package Stack;
class stack{
    int data;
    stack next;
    stack(int data){
        this.data=data;
        this.next=null;
    }
}

public class Stack1 {
    private static stack top=null; // Top of the stack.
    public static java.util.Scanner scanner=new java.util.Scanner(System.in);
    // push function for add new data at the top
    public static void push(){
        try{
            System.out.print("Enter data : ");
            int data=scanner.nextInt();
            stack newData=new stack(data);
            if(top==null){
                top=newData;
            }else{
                newData.next=top;
                top=newData;
            }
            
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    // pop function for delete top element of the stack
    public static void pop(){
        try{
            if(top==null){
                System.out.println("Stack is empty!!");
                return;
            }
            System.out.println("Popped element is "+top.data);
            top=top.next;
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    // traverse function for traverse or display all the element of stack
    public static void traverse(){
        try{
            if(top==null){
                System.out.println("Stack is empty!!");
                return;
            }
            stack temp=top;
            while(temp!=null){
                System.out.println("Data is "+temp.data);
                System.out.println("-----------------------------");
                temp=temp.next;
            }
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
    }
    public static void main(String [] args){
        int choice;
        do{
            System.out.println("--Stack Menu--");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Traverse");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            choice=scanner.nextInt();
            if(choice==1)
                push();
            else if(choice==2)
                pop();
            else if(choice==3)
                traverse();
            else if(choice==4)
                System.out.println("Exited!!");
            else 
                System.out.println("Invalid choice!!");
        }while(choice!=4);
    }
}
