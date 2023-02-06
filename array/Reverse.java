
import java.util.*;

public class Reverse {
    
    public static void reverse(int [] a) {

        /*
         * using two pointer technique go through front and back side
         * ans swap their values...
         */

        for(int l = 0, r = a.length-1; l < r; l++, r--) {
            
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        
        int [] a = {1, 2, 3, 4, 5, 6};

        // printing the array using for each loop

        for(int i : a) {
            System.out.print(i + " ");
        } System.out.println();

        System.out.println("Array without reverse: " + Arrays.toString(a));

        reverse(a);

        System.out.println("Array with reverse: " + Arrays.toString(a));

    }
}
