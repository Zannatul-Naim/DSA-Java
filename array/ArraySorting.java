
import java.util.*;

public class ArraySorting {
    
    public static void main(String[] args) {
        
        int [] a = {1, 3, 4, 5, 6, 2, 0, 9, 8, 7};

        // to sort the array using library method
        // use Arrays keyword

        System.out.print("Before Sorting: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        } System.out.println();

        Arrays.sort(a);
        System.out.print("After sorting: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        } System.out.println();


        // Print the length of an array using array.length 

        System.out.println("Length of the array is: " + a.length);

    }
}
