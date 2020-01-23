package strings;

public class ReverseWordsInString {

    public static String reverseWordsInString(String str){
        String arr[] = str.split(" ");
        for(int i = arr.length -1; i >= 0; i--)
            System.out.print(arr[i] + " ");

        return null;
    }

    public static void main(String[] args) {
        String s = "This is a car";
        reverseWordsInString(s);
    }

}
