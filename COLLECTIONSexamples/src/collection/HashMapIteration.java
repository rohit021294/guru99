package collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapIteration {
    public static void main(String[] args)
    {

        HashMap h=new HashMap();
        h.put("101","rohit");
        h.put(101,"maurya");
        h.put("maurya","rohit");
        Iterator it=h.values().iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }











    }}
