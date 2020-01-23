package strings;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicateFromString {

    public static String removeDuplicateFromString(String str){
        HashSet<Character> hs = new HashSet<Character>();
        char[] aArr = str.toCharArray();
        for (int i = 0; i<aArr.length - 1; i++)
            hs.add(aArr[i]);
//        System.out.println(hs);
        String output = "";
        Iterator it = hs.iterator();
        while(it.hasNext())
            output.concat(it.next().toString());
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {
        String s = "asdssasadfa";
        System.out.println(removeDuplicateFromString(s));
    }
}
