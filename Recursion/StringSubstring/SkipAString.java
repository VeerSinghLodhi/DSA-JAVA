package Recursion.StringSubstring;

public class SkipAString {

    public static void main(String[] args) {
        System.out.println(skip( "asdfappleasdf"));
    }

//    static String skip(  String up){
//        if(up.isEmpty()){
//            System.out.println();
//            return "";
//        }
//
//        if(up.startsWith("apple")){
//            // Skip "apple" → move 5 characters ahead
//            return skip( up.substring(5));
//        }
//        else{
//           return up.charAt(0) + skip( up.substring(1));
//        }
//    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skip(up.substring(5));
        }
        else{
            return up.charAt(0) + skip(up.substring(1));
        }
    }

}
