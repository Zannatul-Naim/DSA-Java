import java.util.Arrays;

import java.util.*;

public class ReverseString {

    public static void reverse(String [] s) {

        List<String> lst = Arrays.asList(s);

        Collections.reverse(lst);

        lst.toArray(s);
    }
    
    public static void main(String[] args) {
        
        String [] sArr = {"abc", "ffg", "helo", "naim", "aaa"};

        System.out.println("Array without reverse: " + Arrays.toString(sArr));

        reverse(sArr);

        System.out.println("Array with reverse: " + Arrays.toString(sArr));
    }
}
