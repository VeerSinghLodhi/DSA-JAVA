
package DoublyLInkedList;

public class UnderstandingOfObject {
    int data;
    String name;
    
    UnderstandingOfObject(int data,String name){
        this.data=data;
        this.name=name;
    }
    void getData(){
        System.out.println("Data is "+data);
        System.out.println("Name is "+name);
    }
    public static void main(String [] args){
        UnderstandingOfObject v1=new UnderstandingOfObject(101,"Veer");
        System.out.println("Data is "+v1.data);
        System.out.println("Name is "+v1.name);
        v1.getData();
        
        UnderstandingOfObject v2=v1;
        System.out.println("Data is "+v2.data);
        v2.name="Muskan";
        System.out.println("Name is "+v2.name);
        v2.getData();
        
        
    }
    
}
