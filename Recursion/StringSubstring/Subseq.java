package Recursion.StringSubstring;

public class Subseq {
    public static void main(String[] args) {

        subset("","abc");
    }

    static void subset(String e,String s){
        if(s.isEmpty()){
            System.out.println(e);
            return ;
        }
        char ch = s.charAt(0);

        subset(e+ch , s.substring(1));
        subset(e , s.substring(1));
    }
}
