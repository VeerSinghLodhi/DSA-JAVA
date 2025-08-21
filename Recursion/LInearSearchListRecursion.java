import java.util.ArrayList;

public class LInearSearchListRecursion {
    

static ArrayList<Integer> search(int[] arr , int target , int idx , ArrayList<Integer> list){
    if(idx == arr.length){
        return list;
    }
    if(arr[idx] == target){
        list.add(idx);
    }
    return search(arr, target, idx+1, list);
}

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,8,8};
        int target =8;
        ArrayList<Integer> list = new ArrayList<Integer>();
       list =  search(arr , target , 0 , list);
       System.out.println(list);
    }
}
