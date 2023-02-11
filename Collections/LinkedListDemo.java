package Collections;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {
        
        LinkedList <String> series = new LinkedList<String>();

        series.add("money heist");
        series.add("farzi");
        series.add("the family man");
        series.add("marvel");
        series.add("spiderman");
        series.add("guti");
        series.add("the silence");

        Iterator it = series.iterator();

        while(it.hasNext()) {

            System.out.println(it.next());
        } System.out.println();
    }
    
}
