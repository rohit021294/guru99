package collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(101,"maurya");
        h.put(102,"sinns");
        h.put(103,"says");
        System.out.println(h);
        System.out.println(h.get("103"));
        System.out.println(h.isEmpty());
        h.remove("101");
        System.out.println(h.containsKey("rohit"));
        System.out.println(h);
        Integer arr[]={4,5,6,7}; //this take wrapper class only
        ArrayList<Integer> l=new ArrayList<Integer>(Arrays.asList(arr));
        for (Integer o:l) {
            System.out.println(o);
        }
System.out.println(l.size());
        HashSet w=new HashSet();
        w.add("rohit");
       System.out.println(w.add("rohit"));
        w.add(10);
        w.add("manish");
        System.out.println(w);






    }
}
