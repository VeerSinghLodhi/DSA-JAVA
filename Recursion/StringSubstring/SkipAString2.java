package Recursion.StringSubstring;

public class SkipAString2 {
    public static void main(String[] args) {
        System.out.println(skip("appleasdfappasdfapp"));
    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(!up.startsWith("apple") && up.startsWith("app")){
            return skip(up.substring(3));
        }
        else{
            return up.charAt(0) + skip(up.substring(1));
        }
    }

}
