package collection;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSettoArray {
    public static void main(String[] args) {


        Set<String> set = new HashSet<String>();

        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");
        System.out.println(set.size());


        HashSet h = new HashSet();
        h.add(10);
        h.add(30);
        h.add(39);
        h.add(498);
        h.add(1);
        h.add(37);
       // System.out.println(h.size());
    Object[] arr=new Object[h.size()];
      arr=h.toArray();
        Arrays.sort(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }







    }
}
