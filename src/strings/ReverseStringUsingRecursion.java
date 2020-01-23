package strings;

public class ReverseStringUsingRecursion {

    static String reverseStringRecursion(String string){

        if(string == null || string.length()<=1)
            return string;

        return reverseStringRecursion(string.substring(1)) + string.charAt(0) ;
    }

    public static void main(String[] args) {

        String str = "Soban";

        System.out.println(reverseStringRecursion(str));

    }

}
