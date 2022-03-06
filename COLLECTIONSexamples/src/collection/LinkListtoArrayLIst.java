package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkListtoArrayLIst {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(10);
    ll.add(20);
    ll.add(50);
        ArrayList a=new ArrayList(ll);
        Collections.sort(a,Collections.reverseOrder());
        for (Object o:a
             ) {
            System.out.print(" "+o);

        }















    }
}