package Recursion;

public class string {

    public static void main(String[] args) {
        String s = "HolaAmiga";
        String s1 = "Hola";
        String s2 = "hoLA";
//        Basic Info & Length
        System.out.println(s.isEmpty());
        System.out.println(s.length());
        System.out.println(s.isBlank());

//        Character Access

        System.out.println(s.charAt(2));
        System.out.println(s.codePointAt(0));//72
        System.out.println(s.codePointBefore(2));//111

//        String Comparison

        System.out.println(s.equals(s1));
        System.out.println(s1.equalsIgnoreCase(s2));


//        Searching

        System.out.println(s.contains("la"));
        System.out.println(s.startsWith("Hol"));
        System.out.println(s.endsWith("ga"));
        System.out.println(s.indexOf("c"));

//        Substrings & Extraction

        System.out.println(s.substring(2));
        System.out.println(s.substring(5,7));


    }
}
