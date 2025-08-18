package Recursion.StringSubstring;

public class AsciiValue {

    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch);
        System.out.println((int)ch);
        System.out.println((char)ch);

        subAscii("" , "Ho");
    }

    static void subAscii(String p , String up){
        if(up.isEmpty()){
            System.out.print(p + " , ");
            return;
        }
        char ch = up.charAt(0);
        subAscii(p + ch , up.substring(1));
        subAscii(p , up.substring(1));
        subAscii(p + (ch+0) , up.substring(1));
    }
}
