package collections;

import java.util.*;

public class ArrayListDemo {
    
public static void main(String[] args) {
    ArrayList <String> genre = new ArrayList <String> ();
    
    genre.add("mystery");
    genre.add("thriller");
    genre.add("fake");
    genre.add("action");

    // define an iterator for the list 
    Iterator it = genre.iterator();

    while(it.hasNext()) {
        System.out.print(it.next() + "  ");
    } System.out.println();

    // remove something from the list
    genre.remove("fake");
    it = genre.iterator();
    while(it.hasNext()) {
        System.out.print(it.next() + "  ");
    } System.out.println();

}
}
