// package Kunal Kushwaha.RecursionArray;

public class LinearSearch {
    static boolean search(int[] arr , int target , int idx){
        if(arr.length == idx){
            return false;
        }
        return arr[idx] == target || search(arr, target, idx+1);
    }

    public static void main(String[] args) {
        int[] arr= {3,2,1,18,9};
        int target = 9;
       boolean res = search(arr , target, 0);
       System.out.println(res);
    }
}
