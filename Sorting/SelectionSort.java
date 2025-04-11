package Sorting;
public class SelectionSort {
    
    // Function for selection sort
    public static void getSelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
    
    
    // Function for print an array
    public static void getPrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int arr[]={4,5,3,6,7,9,1};
        System.out.println("Before Soring...");
        getPrintArray(arr);
        System.out.println("\nAfter Selection Sorting..");
        getSelectionSort(arr);
        getPrintArray(arr);
        System.out.println();
    }
}
