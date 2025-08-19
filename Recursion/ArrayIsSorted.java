// package Kunal Kushwaha.RecursionArray;

public class ArrayIsSorted {
    static boolean sorted(int[] arr , int idx){
        if(arr.length-1 == idx){
            return true;
        }
        return arr[idx]<arr[idx+1] && sorted(arr, idx+1);
    }
    

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
       boolean res = sorted(arr, 0);
         System.out.println(res);
    }
}
