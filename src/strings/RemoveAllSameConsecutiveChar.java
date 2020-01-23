package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveAllSameConsecutiveChar {

    public static void main(String[] args) {

    }

    public static String remove(String s) {

        for (int i = 0; i < s.length() - 2; i++) {
            if(s.charAt(i) == s.charAt(i+1))
                s.substring(i+1, s.length());
        }
        return null;
    }
}
