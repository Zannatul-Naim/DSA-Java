package Collections;

import java.util.*;

public class VectorDemo {

    public static void main(String[] args) {
        
        Vector < Integer > v = new Vector < Integer > ();

        for(int i = 1; i <= 10; i++) v.add(i);

        Iterator it = v.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        } System.out.println();
    }
    
}
