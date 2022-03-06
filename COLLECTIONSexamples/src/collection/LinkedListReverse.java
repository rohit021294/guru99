package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("rohit");
        ll.add("rohitt");
        ll.add("arohit");
        ll.add("arohiyt");
        Collections.sort(ll);   //for ascending order sorting
        System.out.println(ll);
        Collections.sort(ll,Collections.reverseOrder());  //sorting in reverse order
        System.out.println(ll);
    }
}